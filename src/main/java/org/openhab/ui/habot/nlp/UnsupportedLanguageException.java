package org.openhab.ui.habot.nlp;

import java.util.Locale;

public class UnsupportedLanguageException extends Exception {

    private Locale language;

    /**
     *
     */
    private static final long serialVersionUID = -7147837667959343830L;

    public UnsupportedLanguageException(String language) {
        this.language = Locale.forLanguageTag(language);
    }

    @Override
    public String getMessage() {
        return "Unsupported language: " + language.toString();
    }
}
