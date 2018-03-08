package org.openhab.ui.habot.nlp.internal.skill;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.openhab.ui.habot.card.CardBuilder;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.service.component.annotations.Reference;

import com.google.common.collect.ImmutableMap;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class DeactivateObjectSkill extends AbstractItemIntentInterpreter {

    private CardBuilder cardBuilder;
    private EventPublisher eventPublisher;

    @Override
    public String getIntentId() {
        return "deactivate-object";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();

        List<Item> matchedItems = findItems(intent);

        if (matchedItems == null || matchedItems.isEmpty()) {
            interpretation.setAnswer(answerFormatter.getRandomAnswer("nothing_deactivated"));
            interpretation.setHint(answerFormatter.getStandardTagHint(intent.getEntities()));
        } else {
            interpretation.setMatchedItems(matchedItems);

            // filter out the items which can't receive an OFF command
            List<Item> filteredItems = matchedItems.stream()
                    .filter(i -> i.getAcceptedCommandTypes().contains(OnOffType.class)).collect(Collectors.toList());

            interpretation.setCard(cardBuilder.buildCard(intent, filteredItems));

            if (filteredItems.isEmpty()) {
                interpretation.setAnswer(answerFormatter.getRandomAnswer("nothing_deactivated"));
                interpretation.setHint(answerFormatter.getStandardTagHint(intent.getEntities()));
            } else if (filteredItems.size() == 1) {
                if (filteredItems.get(0).getState().equals(OnOffType.OFF)) {
                    interpretation.setAnswer(answerFormatter.getRandomAnswer("switch_already_off"));
                } else {
                    eventPublisher
                            .post(ItemEventFactory.createCommandEvent(filteredItems.get(0).getName(), OnOffType.OFF));
                    interpretation.setAnswer(answerFormatter.getRandomAnswer("switch_deactivated"));
                }
            } else {
                for (Item item : filteredItems) {
                    eventPublisher.post(ItemEventFactory.createCommandEvent(item.getName(), OnOffType.OFF));
                }
                interpretation.setAnswer(answerFormatter.getRandomAnswer("switches_deactivated",
                        ImmutableMap.of("count", String.valueOf(filteredItems.size()))));
            }
        }

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

    @Reference
    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = null;
    }
}
