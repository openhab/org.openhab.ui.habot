package org.openhab.ui.habot.nlp.internal.skill;

import java.util.List;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.transform.TransformationHelper;
import org.eclipse.smarthome.core.types.StateDescription;
import org.openhab.ui.habot.card.Card;
import org.openhab.ui.habot.card.Component;
import org.openhab.ui.habot.card.Slot;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Reference;

@org.osgi.service.component.annotations.Component(service = Skill.class, immediate = true)
public class GetStatusSkill extends AbstractItemIntentInterpreter {

    @Override
    public String getIntentId() {
        return "get-status";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();
        List<Item> matchedItems = findItems(intent);

        if (matchedItems == null || matchedItems.isEmpty()) {
            interpretation.setAnswer(answerFormatter.getRandomAnswer("answer_nothing_found"));
        } else {
            interpretation.setMatchedItems(matchedItems);
            if (matchedItems.size() == 1) {
                Item item = matchedItems.get(0);
                Card singleCard = new Card("HbCard");
                singleCard.setTitle(item.getLabel());
                singleCard.setSubtitle(item.getName());

                Slot rightSlot = singleCard.addSlot("right");

                Component component = new Component("HbSingleItemValue");
                component.addConfig("item", item.getName());
                component.addConfig("type", item.getType());
                if (item.getStateDescription() != null) {
                    String transformedState = considerTransformation(item.getState().toString(),
                            item.getStateDescription());
                    if (!transformedState.equals(item.getState().toString())) {
                        component.addConfig("state", transformedState);
                    } else {
                        component.addConfig("state", item.getState().format(item.getStateDescription().getPattern()));
                    }
                } else {
                    component.addConfig("state", item.getState().toString());
                }

                rightSlot.addComponent(component);

                interpretation.setCard(singleCard);

                interpretation.setAnswer(answerFormatter.getRandomAnswer("info_found_simple"));
            } else {
                Card card = new Card("HbCard");

                // TODO: maybe figure out a title for the card
                card.setSubtitle(matchedItems.size() + " items"); // TODO: i18n

                Slot mainSlot = card.addSlot("list");

                Component list = new Component("HbList");
                Slot listSlot = list.addSlot("main");
                for (Item item : matchedItems) {
                    Component listItem = new Component("HbListItem");
                    listItem.addConfig("item", item.getName());
                    listItem.addConfig("label", item.getLabel());
                    if (item.getStateDescription() != null && item.getStateDescription().getPattern() != null) {
                        String transformedState = considerTransformation(item.getState().toString(),
                                item.getStateDescription());
                        if (!transformedState.equals(item.getState().toString())) {
                            listItem.addConfig("state", transformedState);
                        } else {
                            listItem.addConfig("state",
                                    item.getState().format(item.getStateDescription().getPattern()));
                        }
                    } else {
                        listItem.addConfig("state", item.getState().toString());
                    }

                    listSlot.addComponent(listItem);
                }

                mainSlot.addComponent(list);

                interpretation.setCard(card);

                interpretation.setAnswer(answerFormatter.getRandomAnswer("info_found_simple"));
            }
        }

        return interpretation;
    }

    private String considerTransformation(String state, StateDescription stateDescription) {
        if (stateDescription != null && stateDescription.getPattern() != null) {
            try {
                return TransformationHelper.transform(FrameworkUtil.getBundle(GetStatusSkill.class).getBundleContext(),
                        stateDescription.getPattern(), state.toString());
            } catch (NoClassDefFoundError ex) {
                // TransformationHelper is optional dependency, so ignore if class not found
                // return state as it is without transformation
                return state;
            }
        } else {
            return state;
        }
    }

    @Reference
    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
    }

}
