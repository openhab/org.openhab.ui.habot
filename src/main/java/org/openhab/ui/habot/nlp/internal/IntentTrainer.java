package org.openhab.ui.habot.nlp.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

import org.openhab.ui.habot.nlp.AlphaNumericTokenizer;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.Skill;
import org.openhab.ui.habot.nlp.UnsupportedLanguageException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import opennlp.tools.doccat.DoccatFactory;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.doccat.DocumentSample;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.NameSample;
import opennlp.tools.namefind.NameSampleDataStream;
import opennlp.tools.namefind.TokenNameFinderFactory;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.ObjectStreamUtils;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;
import opennlp.tools.util.TrainingParameters;

public class IntentTrainer {

    private final Logger logger = LoggerFactory.getLogger(IntentTrainer.class);

    private DocumentCategorizerME categorizer;
    private NameFinderME nameFinder;
    private Tokenizer tokenizer;

    public IntentTrainer(String language, Collection<Skill> skills) throws Exception {
        this(language, skills, null, null);
    }

    public IntentTrainer(String language, Collection<Skill> skills, InputStream additionalNameSamples,
            String tokenizerId) throws Exception {

        this.tokenizer = (tokenizerId == "alphanumeric") ? AlphaNumericTokenizer.INSTANCE
                : WhitespaceTokenizer.INSTANCE;

        /* Prepare the streams of document samples sourced from each skill's training data */
        List<ObjectStream<DocumentSample>> categoryStreams = new ArrayList<ObjectStream<DocumentSample>>();
        for (Skill skill : skills) {
            String intent = skill.getIntentId();

            try {
                InputStream trainingData = skill.getTrainingData(language);
                ObjectStream<String> lineStream = new PlainTextByLineStream(new InputStreamFactory() {

                    @Override
                    public InputStream createInputStream() throws IOException {
                        return trainingData;
                    }
                }, "UTF-8");

                ObjectStream<DocumentSample> documentSampleStream = new IntentDocumentSampleStream(intent, lineStream);
                categoryStreams.add(documentSampleStream);
            } catch (UnsupportedLanguageException e) {
                logger.warn("Ignoring intent {} because no training data for language {}", skill.getIntentId(),
                        language);
            }
        }

        if (categoryStreams.isEmpty()) {
            throw new UnsupportedLanguageException(language);
        }

        /* concatenate the document samples object streams into one to feed to the trainer */
        ObjectStream<DocumentSample> combinedDocumentSampleStream = ObjectStreamUtils
                .concatenateObjectStream(categoryStreams);

        /* train the categorizer! */
        DoccatModel doccatModel = DocumentCategorizerME.train(language, combinedDocumentSampleStream,
                TrainingParameters.defaultParams(), new DoccatFactory());
        combinedDocumentSampleStream.close();

        List<TokenNameFinderModel> tokenNameFinderModels = new ArrayList<TokenNameFinderModel>();

        /* Use the skill's training data again, to train the entity extractor (token name finder) this time */
        List<ObjectStream<NameSample>> nameStreams = new ArrayList<ObjectStream<NameSample>>();
        for (Skill skill : skills) {
            try {
                InputStream trainingData = skill.getTrainingData(language);
                ObjectStream<String> lineStream = new PlainTextByLineStream(new InputStreamFactory() {

                    @Override
                    public InputStream createInputStream() throws IOException {
                        return trainingData;
                    }
                }, "UTF-8");
                ObjectStream<NameSample> nameSampleStream = new NameSampleDataStream(lineStream);
                nameStreams.add(nameSampleStream);
            } catch (UnsupportedLanguageException e) {
                logger.warn("Ignoring intent {} because no training data for language {}", skill.getIntentId(),
                        language);
            }
        }

        /* Also use the additional training data for entity extraction (i.e. actual items' tags) if provided */
        if (additionalNameSamples != null) {
            ObjectStream<String> additionalLineStream = new PlainTextByLineStream(new InputStreamFactory() {

                @Override
                public InputStream createInputStream() throws IOException {
                    return additionalNameSamples;
                }

            }, "UTF-8");
            ObjectStream<NameSample> additionalNameSamplesStream = new NameSampleDataStream(additionalLineStream);
            nameStreams.add(additionalNameSamplesStream);
        }

        /* concatenate the name samples object streams into one to feed to the trainer */
        ObjectStream<NameSample> combinedNameSampleStream = ObjectStreamUtils.concatenateObjectStream(nameStreams);

        /* train the token name finder! */
        TokenNameFinderModel tokenNameFinderModel = NameFinderME.train(language, null, combinedNameSampleStream,
                TrainingParameters.defaultParams(), new TokenNameFinderFactory());
        combinedNameSampleStream.close();
        tokenNameFinderModels.add(tokenNameFinderModel);

        categorizer = new DocumentCategorizerME(doccatModel);
        nameFinder = new NameFinderME(tokenNameFinderModel);
    }

    public Intent interpret(String query) {
        String[] tokens = this.tokenizer.tokenize(query.toLowerCase());
        // remove eventual trailing punctuation
        tokens[tokens.length - 1] = tokens[tokens.length - 1].replaceAll("\\s*[!?.]+$", "");

        double[] outcome = categorizer.categorize(tokens);
        logger.debug(categorizer.getAllResults(outcome));

        Intent intent = new Intent(categorizer.getBestCategory(outcome));

        Span[] spans = nameFinder.find(tokens);
        String[] names = Span.spansToStrings(spans, tokens);
        for (int i = 0; i < spans.length; i++) {
            intent.getEntities().put(spans[i].getType(), names[i]);
        }

        logger.debug(intent.toString());

        return intent;
    }

    public SortedMap<Double, Set<String>> getScoreMap(String query) {
        String[] tokens = this.tokenizer.tokenize(query.toLowerCase());
        return categorizer.sortedScoreMap(tokens);
    }

}