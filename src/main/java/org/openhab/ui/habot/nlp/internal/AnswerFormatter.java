package org.openhab.ui.habot.nlp.internal;

import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;

import com.google.common.collect.ImmutableMap;

public class AnswerFormatter {

    ResourceBundle answers;
    Locale locale;

    public AnswerFormatter(Locale locale) {
        this.locale = locale;
        this.answers = ResourceBundle.getBundle("answers", locale,
                ResourceBundle.Control.getNoFallbackControl(ResourceBundle.Control.FORMAT_DEFAULT));
    }

    public AnswerFormatter(String language) {
        this.locale = new Locale(language);
        this.answers = ResourceBundle.getBundle("answers", locale,
                ResourceBundle.Control.getNoFallbackControl(ResourceBundle.Control.FORMAT_DEFAULT));
    }

    public String getRandomAnswer(String key, Map<String, String> placeholderValues) {
        String alternativesStr = answers.getString(key);

        String[] alternatives = alternativesStr.split("\\|");

        Random random = new Random();
        String answer = alternatives[random.nextInt(alternatives.length)].trim();

        if (placeholderValues != null) {
            for (String placeholder : placeholderValues.keySet()) {
                answer = answer.replace("{" + placeholder + "}", placeholderValues.get(placeholder));
            }
        }

        return answer;
    }

    public String getRandomAnswer(String key) {
        return getRandomAnswer(key, null);
    }

    public String getStandardTagHint(Map<String, String> entities) {
        return getRandomAnswer("standard_hint",
                ImmutableMap.of("tags", String.join(" & ", entities.entrySet().stream()
                        .filter(e -> e.getKey().equals("object") || e.getKey().equals("location"))
                        .map(e -> String.format("\"%s:%s\"", e.getKey(), e.getValue())).toArray(String[]::new))));
    }
}
