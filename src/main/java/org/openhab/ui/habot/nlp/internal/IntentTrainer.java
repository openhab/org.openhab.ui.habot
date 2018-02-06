package org.openhab.ui.habot.nlp.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.Skill;
import org.openhab.ui.habot.nlp.Tokenizer;
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
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.ObjectStreamUtils;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;
import opennlp.tools.util.TrainingParameters;

public class IntentTrainer {

    private final Logger logger = LoggerFactory.getLogger(IntentTrainer.class);

    private DocumentCategorizerME categorizer;
    private NameFinderME[] nameFinderMEs;

    public IntentTrainer(String language, Collection<Skill> skills) throws Exception {

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
        ObjectStream<DocumentSample> combinedDocumentSampleStream = ObjectStreamUtils
                .concatenateObjectStream(categoryStreams);

        DoccatModel doccatModel = DocumentCategorizerME.train(language, combinedDocumentSampleStream,
                TrainingParameters.defaultParams(), new DoccatFactory());
        combinedDocumentSampleStream.close();

        List<TokenNameFinderModel> tokenNameFinderModels = new ArrayList<TokenNameFinderModel>();

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
        ObjectStream<NameSample> combinedNameSampleStream = ObjectStreamUtils.concatenateObjectStream(nameStreams);

        TokenNameFinderModel tokenNameFinderModel = NameFinderME.train(language, null, combinedNameSampleStream,
                TrainingParameters.defaultParams(), new TokenNameFinderFactory());
        combinedNameSampleStream.close();
        tokenNameFinderModels.add(tokenNameFinderModel);

        categorizer = new DocumentCategorizerME(doccatModel);
        nameFinderMEs = new NameFinderME[tokenNameFinderModels.size()];
        for (int i = 0; i < tokenNameFinderModels.size(); i++) {
            nameFinderMEs[i] = new NameFinderME(tokenNameFinderModels.get(i));
        }
    }

    public Intent interpret(String query) {
        String[] tokens = Tokenizer.INSTANCE.tokenize(query.toLowerCase());
        double[] outcome = categorizer.categorize(tokens);
        logger.debug(categorizer.getAllResults(outcome));

        Intent intent = new Intent(categorizer.getBestCategory(outcome));

        for (NameFinderME nameFinderME : nameFinderMEs) {
            Span[] spans = nameFinderME.find(tokens);
            String[] names = Span.spansToStrings(spans, tokens);
            for (int i = 0; i < spans.length; i++) {
                intent.getEntities().put(spans[i].getType(), names[i]);
            }
        }

        logger.debug(intent.toString());

        return intent;
    }

}