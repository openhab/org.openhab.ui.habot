package org.openhab.ui.habot.nlp;

import java.io.InputStream;

/**
 * This interface must be implemented for an actual interpretation to occur for a certain intent.
 * When the NLP recognizes the intent from the user query, this class will be used to retrieve information and/or
 * perform
 * actions.
 *
 */
public interface Skill {
    /**
     * Gets the internal name of the intent this class handles.
     *
     * @return the id of the intent covered by this skill
     */
    String getIntentId();

    /**
     * Get an input stream containing the training data for the specified intent to feed to the OpenNLP document
     * categorizer. The data consists in a series of sentences to be associated with the intent, and containing named
     * entities with standard OpenNLP tags. Example:
     * what's the &lt;START:object&gt;temperature&lt;END&gt; in the &lt;START:location&gt;living room&lt;END&gt;
     *
     * @param locale the locale containing the expected language for the NLP training data
     * @throws UnsupportedLanguageException if the specified language is not supported by this skill
     * @return the input stream containing the training data
     */
    InputStream getTrainingData(String language) throws UnsupportedLanguageException;

    /**
     * Interprets the recognized intent.
     *
     * @param intent the intent to interpret
     * @param language the language of the query
     * @return the {@link IntentInterpretation} containing the results of the interpretation
     */
    IntentInterpretation interpret(Intent intent, String language);
}
