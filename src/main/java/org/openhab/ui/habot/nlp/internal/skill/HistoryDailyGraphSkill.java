package org.openhab.ui.habot.nlp.internal.skill;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.openhab.ui.habot.card.Card;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.service.component.annotations.Reference;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class HistoryDailyGraphSkill extends AbstractItemIntentInterpreter {

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

            Card graphCard = new Card("HbCard");

            String period = "d";
            if (intent.getEntities().containsKey("period")) {
                period = intent.getEntities().get("period").concat(period);
            }

            if (matchedItems.size() == 1) {
                Item item = matchedItems.get(0);

                graphCard.setTitle(item.getLabel());
                graphCard.setSubtitle(item.getName());

                graphCard.setImageUri(String.format("/chart?items=%s&period=%s", item.getName(), period));
            } else {
                graphCard.setTitle("");
                graphCard.setSubtitle(matchedItems.size() + " items"); // TODO: i18n

                String itemNames = String.join(",",
                        matchedItems.stream().map(i -> i.getName()).collect(Collectors.toList()));

                graphCard.setImageUri(String.format("/chart?items=%s&period=%s", itemNames, period));
            }

            interpretation.setCard(graphCard);

        }

        interpretation.setAnswer(answerFormatter.getRandomAnswer("info_found_simple"));

        return interpretation;
    }

    @Reference
    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
    }
}
