package org.openhab.ui.habot.nlp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.items.GroupItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.openhab.ui.habot.nlp.internal.AnswerFormatter;

public abstract class AbstractItemIntentInterpreter implements Skill {

    protected ItemRegistry itemRegistry;
    protected AnswerFormatter answerFormatter;

    protected List<Item> findItems(Intent intent) {
        Collection<Item> itemsWithLocationTag = null;
        if (intent.entities.containsKey("location")) {
            itemsWithLocationTag = itemRegistry.getItemsByTag("location:" + intent.entities.get("location"));
        }

        Collection<Item> itemsWithObjectTag = null;
        if (intent.entities.containsKey("object")) {
            itemsWithObjectTag = itemRegistry.getItemsByTag("object:" + intent.entities.get("object"));
        }

        ArrayList<Item> itemsMatchingLocationSlot = null;
        if (itemsWithLocationTag != null) {
            itemsMatchingLocationSlot = new ArrayList<Item>();
            for (Item item : itemsWithLocationTag) {
                if (item instanceof GroupItem) {
                    GroupItem groupItem = (GroupItem) item;
                    for (Item member : groupItem.getAllMembers()) {
                        itemsMatchingLocationSlot.add(member);
                    }
                } else {
                    itemsMatchingLocationSlot.add(item);
                }
            }
        }

        ArrayList<Item> itemsMatchingObjectSlot = null;
        if (itemsWithObjectTag != null) {
            itemsMatchingObjectSlot = new ArrayList<Item>();
            for (Item item : itemsWithObjectTag) {
                if (item instanceof GroupItem) {
                    GroupItem groupItem = (GroupItem) item;
                    for (Item member : groupItem.getAllMembers()) {
                        itemsMatchingObjectSlot.add(member);
                    }
                } else {
                    itemsMatchingObjectSlot.add(item);
                }
            }
        }

        if (itemsMatchingLocationSlot == null && itemsMatchingObjectSlot == null) {
            return null;
        } else if (itemsMatchingObjectSlot == null) {
            return itemsMatchingLocationSlot;
        } else if (itemsMatchingLocationSlot == null) {
            return itemsMatchingObjectSlot;
        } else {
            return itemsMatchingLocationSlot.stream().filter(itemsMatchingObjectSlot::contains)
                    .collect(Collectors.toList());
        }
    }

    @Override
    public InputStream getTrainingData(String language) throws UnsupportedLanguageException {
        answerFormatter = new AnswerFormatter(language);

        InputStream trainingData = Skill.class.getClassLoader()
                .getResourceAsStream("train/" + language + "/" + this.getIntentId() + ".txt");

        if (trainingData == null) {
            throw new UnsupportedLanguageException(language);
        }

        return trainingData;
    }

}
