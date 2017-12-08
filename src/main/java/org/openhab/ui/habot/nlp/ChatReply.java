package org.openhab.ui.habot.nlp;

import java.util.Locale;

import org.openhab.ui.habot.card.Card;

public class ChatReply {

    /**
     * The locale of the reply
     */
    String language;

    /**
     * Natural language query from the user
     */
    String query;

    /**
     * Natural language answer from HABot
     */
    String answer;

    /**
     * Interpreted intent and slots
     */
    Intent intent;

    String[] matchedItemNames;

    Card card;

    public String getLanguage() {
        return language;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public ChatReply(Locale locale) {
        this.language = locale.getLanguage();
    }

    public ChatReply(Locale locale, String query) {
        this.language = locale.getLanguage();
        this.query = query;
    }

    public String[] getMatchedItemNames() {
        return matchedItemNames;
    }

    public void setMatchedItems(String[] matchedItemNames) {
        this.matchedItemNames = matchedItemNames;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
