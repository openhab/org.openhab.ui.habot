package org.openhab.ui.habot.nlp.internal.skill;

import java.util.List;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.openhab.ui.habot.card.CardBuilder;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.service.component.annotations.Reference;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class HistoryDailyGraphSkill extends AbstractItemIntentInterpreter {

    private CardBuilder cardBuilder;

    @Override
    public String getIntentId() {
        return "get-history-daily";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();
        List<Item> matchedItems = findItems(intent);

        if (matchedItems == null || matchedItems.isEmpty()) {
            interpretation.setAnswer(answerFormatter.getRandomAnswer("answer_nothing_found"));
        } else {
            interpretation.setMatchedItems(matchedItems);

            String period = "D";
            if (intent.getEntities().containsKey("period")) {
                period = intent.getEntities().get("period").concat(period);
            }

            interpretation.setCard(this.cardBuilder.buildChartCard(intent, matchedItems, period));
        }

        interpretation.setAnswer(answerFormatter.getRandomAnswer("info_found_simple"));

        return interpretation;
    }

    @Reference
    public void setCardBuilder(CardBuilder cardBuilder) {
        this.cardBuilder = cardBuilder;
    }

    public void unsetCardBuilder(CardBuilder cardBuilder) {
        this.cardBuilder = null;
    }

    @Reference
    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
    }
}
