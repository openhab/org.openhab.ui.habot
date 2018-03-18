package org.openhab.ui.habot.nlp.internal.skill;

import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.library.types.HSBType;
import org.eclipse.smarthome.core.library.types.PercentType;
import org.openhab.ui.habot.card.CardBuilder;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.service.component.annotations.Reference;

import com.google.common.collect.ImmutableMap;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class SetValueSkill extends AbstractItemIntentInterpreter {

    private CardBuilder cardBuilder;
    private EventPublisher eventPublisher;

    @Override
    public String getIntentId() {
        return "set-value";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();

        List<Item> matchedItems = findItems(intent);

        if (matchedItems == null || matchedItems.isEmpty()) {
            interpretation.setAnswer(answerFormatter.getRandomAnswer("answer_nothing_found"));
            interpretation.setHint(answerFormatter.getStandardTagHint(intent.getEntities()));
        } else {
            interpretation.setMatchedItems(matchedItems);

            if (intent.getEntities().containsKey("color")) {
                interpretSetColor(intent, language, interpretation, matchedItems);
            } else if (intent.getEntities().containsKey("value")) {
                interpretSetValue(intent, language, interpretation, matchedItems);
            } else {
                interpretation.setAnswer(answerFormatter.getRandomAnswer("value_misunderstood"));
            }
        }

        return interpretation;
    }

    private void interpretSetColor(Intent intent, String language, IntentInterpretation interpretation,
            List<Item> matchedItems) {
        String colorString = intent.getEntities().get("color");

        // filter out the items which can't receive an HSB command
        List<Item> filteredItems = matchedItems.stream()
                .filter(i -> i.getAcceptedCommandTypes().contains(HSBType.class)).collect(Collectors.toList());

        String hsbValue;
        try {
            ResourceBundle colors = ResourceBundle.getBundle("colors", new Locale(language));
            hsbValue = colors.getString("color_" + colorString);
        } catch (MissingResourceException e) {
            interpretation.setAnswer(
                    answerFormatter.getRandomAnswer("set_color_unknown", ImmutableMap.of("color", colorString)));
            return;
        }

        if (filteredItems.isEmpty()) {
            interpretation.setAnswer(
                    answerFormatter.getRandomAnswer("set_color_no_item", ImmutableMap.of("color", colorString)));
            interpretation.setHint(answerFormatter.getStandardTagHint(intent.getEntities()));
        } else if (filteredItems.size() == 1) {
            interpretation.setCard(cardBuilder.buildCard(intent, filteredItems));
            eventPublisher
                    .post(ItemEventFactory.createCommandEvent(filteredItems.get(0).getName(), new HSBType(hsbValue)));
            interpretation.setAnswer(
                    answerFormatter.getRandomAnswer("set_color_single", ImmutableMap.of("color", colorString)));
        } else {
            interpretation.setCard(cardBuilder.buildCard(intent, filteredItems));
            for (Item item : filteredItems) {
                eventPublisher.post(ItemEventFactory.createCommandEvent(item.getName(), new HSBType(hsbValue)));
            }
            interpretation.setAnswer(answerFormatter.getRandomAnswer("set_color_multiple",
                    ImmutableMap.of("count", String.valueOf(filteredItems.size()), "color", colorString)));
        }
    }

    private void interpretSetValue(Intent intent, String language, IntentInterpretation interpretation,
            List<Item> matchedItems) {

        String rawValue = intent.getEntities().get("value");

        // Set a color
        String cleanedValue = rawValue.replaceAll("[^0-9\\.,]", "");

        // filter out the items which can't receive an DecimalType command - includes PercentType, HSBType
        List<Item> filteredItems = matchedItems.stream()
                .filter(i -> i.getAcceptedCommandTypes().contains(DecimalType.class)
                        || i.getAcceptedCommandTypes().contains(PercentType.class))
                .collect(Collectors.toList());

        if (filteredItems.isEmpty()) {
            interpretation.setAnswer(
                    answerFormatter.getRandomAnswer("nothing_set_no_item", ImmutableMap.of("value", rawValue)));
            interpretation.setHint(answerFormatter.getStandardTagHint(intent.getEntities()));
        } else if (filteredItems.size() == 1) {
            DecimalType value = (filteredItems.get(0).getAcceptedCommandTypes().contains(DecimalType.class))
                    ? DecimalType.valueOf(cleanedValue)
                    : PercentType.valueOf(cleanedValue);
            interpretation.setCard(cardBuilder.buildCard(intent, filteredItems));
            eventPublisher.post(ItemEventFactory.createCommandEvent(filteredItems.get(0).getName(), value));
            interpretation
                    .setAnswer(answerFormatter.getRandomAnswer("set_value_single", ImmutableMap.of("value", rawValue)));
        } else {
            interpretation.setCard(cardBuilder.buildCard(intent, filteredItems));
            for (Item item : filteredItems) {
                DecimalType value = (item.getAcceptedCommandTypes().contains(DecimalType.class))
                        ? DecimalType.valueOf(cleanedValue)
                        : PercentType.valueOf(cleanedValue);
                eventPublisher.post(ItemEventFactory.createCommandEvent(item.getName(), value));
            }
            interpretation.setAnswer(answerFormatter.getRandomAnswer("set_value_multiple",
                    ImmutableMap.of("count", String.valueOf(filteredItems.size()), "value", rawValue)));
        }
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
