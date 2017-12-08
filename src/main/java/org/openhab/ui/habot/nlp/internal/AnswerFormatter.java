package org.openhab.ui.habot.nlp.internal;

import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;

public class AnswerFormatter {

    ResourceBundle answers;
    Locale locale;

    public AnswerFormatter(Locale locale) {
        this.locale = locale;
        this.answers = ResourceBundle.getBundle("answers", locale);
    }

    public AnswerFormatter(String language) {
        this.locale = new Locale(language);
        this.answers = ResourceBundle.getBundle("answers", locale);
    }

    public String getRandomAnswer(String key, Map<String, String> placeholderValues) {
        String alternativesStr = answers.getString(key);

        String[] alternatives = alternativesStr.split("\\|");

        Random random = new Random();
        return alternatives[random.nextInt(alternatives.length)].trim();
    }

    public String getRandomAnswer(String key) {
        return getRandomAnswer(key, null);
    }
}
