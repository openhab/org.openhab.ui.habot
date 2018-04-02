/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.nlp;

import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.items.GroupItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.openhab.ui.habot.nlp.internal.AnswerFormatter;

/**
 * An abstract implmentation of a @link {@link Skill} with helper methods to find items matching an @link {@link Intent}
 * object and location entities.
 *
 * It also contains a default implementation of the training data sourcing (text file in train/(language)/(intent).txt).
 *
 * @author Yannick Schaus
 */
public abstract class AbstractItemIntentInterpreter implements Skill {

    protected ItemRegistry itemRegistry;
    protected AnswerFormatter answerFormatter;

    /**
     * Returns the items matching the entities in the intent by looking for tags prefixed by "object:" or "location:".
     * Group items are expanded and the tags, and tags are inherited to members.
     *
     * The resulting items should match the object AND the location if both are provided.
     *
     * @param intent the {@link Intent} containing the entities to match to items' tags.
     * @return the set of matching items
     */
    protected Set<Item> findItems(Intent intent) {
        Collection<Item> itemsWithLocationTag = null;
        if (intent.entities.containsKey("location")) {
            itemsWithLocationTag = itemRegistry.getItemsByTag("location:" + intent.entities.get("location"));
        }

        Collection<Item> itemsWithObjectTag = null;
        if (intent.entities.containsKey("object")) {
            itemsWithObjectTag = itemRegistry.getItemsByTag("object:" + intent.entities.get("object"));
        }

        HashSet<Item> itemsMatchingLocationSlot = null;
        if (itemsWithLocationTag != null) {
            itemsMatchingLocationSlot = new HashSet<Item>();
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

        HashSet<Item> itemsMatchingObjectSlot = null;
        if (itemsWithObjectTag != null) {
            itemsMatchingObjectSlot = new HashSet<Item>();
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
                    .collect(Collectors.toSet());
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
