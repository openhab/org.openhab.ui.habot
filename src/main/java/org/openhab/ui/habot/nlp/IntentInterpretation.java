package org.openhab.ui.habot.nlp;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.openhab.ui.habot.card.Card;

public class IntentInterpretation {

    String answer;

    Collection<Item> matchedItems;

    Card card;

    public Collection<Item> getMatchedItems() {
        return matchedItems;
    }

    public void setMatchedItems(Collection<Item> matchedItems) {
        this.matchedItems = matchedItems;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String reply) {
        this.answer = reply;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
