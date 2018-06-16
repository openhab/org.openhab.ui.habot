/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.nlp.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.smarthome.core.common.registry.RegistryChangeListener;
import org.eclipse.smarthome.core.items.GroupItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.Metadata;
import org.eclipse.smarthome.core.items.MetadataKey;
import org.eclipse.smarthome.core.items.MetadataRegistry;
import org.openhab.ui.habot.nlp.ItemNamedAttribute;
import org.openhab.ui.habot.nlp.ItemNamedAttribute.AttributeSource;
import org.openhab.ui.habot.nlp.UnsupportedLanguageException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class retrieves and caches sets of {@link ItemNamedAttribute} mapped to items.
 * It uses semantic tags and additional monikers defined in metadata ("habot" namespace).
 * The named attributes sourced from tags will be translated to the current language as
 * specified. Inheritance is always applied for metadata, while for tags it can be preventing
 * with the "inheritTags" configuration property in the "habot" metadata namespace.
 *
 * @author Yannick Schaus
 */
@Component(service = ItemNamedAttributesResolver.class, immediate = true)
public class ItemNamedAttributesResolver {

    private final Logger logger = LoggerFactory.getLogger(ItemNamedAttributesResolver.class);

    private ItemRegistry itemRegistry;
    private MetadataRegistry metadataRegistry;
    private Map<Item, Set<ItemNamedAttribute>> itemAttributes;
    private Locale currentLocale = null;
    ResourceBundle tagAttributes;

    /**
     * Sets the current locale.
     * Attributes derived from semantic tags will use this locale.
     * This will invalidate the attribute cache.
     *
     * @param locale
     */
    public void setLocale(Locale locale) {
        if (!locale.equals(currentLocale)) {
            this.currentLocale = locale;
            logger.debug("Language set to: %s - invalidating cached item named attributes", locale.getLanguage());
            this.itemAttributes = null;
            this.tagAttributes = ResourceBundle.getBundle("tagattributes", locale,
                    ResourceBundle.Control.getNoFallbackControl(ResourceBundle.Control.FORMAT_DEFAULT));

        }
    }

    /**
     * Returns a map of all named attributes by item.
     *
     * @return attributes mapped by item
     * @throws UnsupportedLanguageException
     */
    public Map<Item, Set<ItemNamedAttribute>> getAllItemNamedAttributes() throws UnsupportedLanguageException {
        if (currentLocale == null) {
            throw new UnsupportedLanguageException(currentLocale);
        }

        if (itemAttributes == null) {
            updateItemNamedAttributes();
        }

        return itemAttributes;
    }

    /**
     * Returns items having attributes matching the provided object and locations.
     * Both have to match if provided.
     *
     * @param object the object to find in the attributes
     * @param location the location to find in the attribute
     * @return a stream of matching items (groups included)
     */
    public Stream<Item> getMatchingItems(String object, String location) {
        return itemAttributes.entrySet().stream().filter(entry -> {
            boolean objectMatch = false;
            boolean locationMatch = false;

            if (object != null && entry.getValue().stream().anyMatch(a -> a.getValue().equalsIgnoreCase(object))) {
                objectMatch = true;
            }
            if (location != null && entry.getValue().stream().anyMatch(a -> a.getValue().equalsIgnoreCase(location))) {
                locationMatch = true;
            }

            return (object != null && location != null) ? objectMatch && locationMatch : objectMatch || locationMatch;
        }).map(entry -> entry.getKey());
    }

    private void updateItemNamedAttributes() {
        itemAttributes = new HashMap<Item, Set<ItemNamedAttribute>>();
        for (Item item : itemRegistry.getAll()) {

            Metadata metadata = metadataRegistry.get(new MetadataKey("habot", item.getName()));

            // look for semantic tags
            for (String tag : item.getTags()) {
                if (tag.split(":").length != 2) {
                    continue;
                }

                String type = tag.startsWith("location:") ? "location" : "object";

                String semanticTagNamedAttributes;
                try {
                    boolean inheritTag = true;
                    if (metadata != null && metadata.getConfiguration().containsKey("inheritTags")) {
                        inheritTag = (boolean) metadata.getConfiguration().get("inheritTags");
                    }
                    semanticTagNamedAttributes = this.tagAttributes.getString(tag.split(":")[1].toLowerCase());
                    for (String tagAttribute : semanticTagNamedAttributes.split(",")) {
                        addItemAttribute(item, type, tagAttribute.trim(), AttributeSource.TAG, false, inheritTag);
                    }
                } catch (MissingResourceException e) {
                    logger.debug("No named attributes found for tag {}", tag);
                }
            }

            // look for additional comma-separated item monikers in the "habot" metadata namespace
            if (metadata != null && !(metadata.getValue().isEmpty())) {
                String type = "object";

                if (item instanceof GroupItem && item.getTags().stream().anyMatch(t -> t.startsWith("location:"))) {
                    type = "location";
                }
                if (metadata.getConfiguration().containsKey("type")) {
                    type = metadata.getConfiguration().get("type").toString();
                }

                for (String moniker : metadata.getValue().split(",")) {
                    // monikers in metadata ARE inherited
                    addItemAttribute(item, type, moniker.trim(), AttributeSource.METADATA, false, true);
                }
            }
        }
    }

    private void addItemAttribute(Item item, String type, String value, AttributeSource source, boolean isInherited,
            boolean inheritToGroupMembers) {
        Set<ItemNamedAttribute> attributes = itemAttributes.get(item);
        if (attributes == null) {
            attributes = new HashSet<ItemNamedAttribute>();
        }

        ItemNamedAttribute attribute = new ItemNamedAttribute(type, value, isInherited, source);
        attributes.add(attribute);

        if (item instanceof GroupItem && inheritToGroupMembers) {
            for (Item groupMemberItem : ((GroupItem) item).getMembers(i -> true)) {
                addItemAttribute(groupMemberItem, type, value, source, true, true);
            }
        }

        itemAttributes.put(item, attributes);
    }

    @Reference
    protected void setItemRegistry(ItemRegistry itemRegistry) {
        if (this.itemRegistry == null) {
            this.itemRegistry = itemRegistry;
            this.itemRegistry.addRegistryChangeListener(registryChangeListener);
        }
    }

    protected void unsetItemRegistry(ItemRegistry itemRegistry) {
        if (itemRegistry == this.itemRegistry) {
            this.itemRegistry.removeRegistryChangeListener(registryChangeListener);
            this.itemRegistry = null;
        }
    }

    @Reference
    protected void setMetadataRegistry(MetadataRegistry metadataRegistry) {
        if (this.metadataRegistry == null) {
            this.metadataRegistry = metadataRegistry;
            this.metadataRegistry.addRegistryChangeListener(metadataRegistryChangeListener);
        }
    }

    protected void unsetMetadataRegistry(MetadataRegistry metadataRegistry) {
        if (metadataRegistry == this.metadataRegistry) {
            this.metadataRegistry.removeRegistryChangeListener(metadataRegistryChangeListener);
            this.metadataRegistry = null;
        }
    }

    private @NonNull RegistryChangeListener<Item> registryChangeListener = new RegistryChangeListener<Item>() {
        @Override
        public void added(Item element) {
            logger.debug("Invalidating cached item named attributes");
            itemAttributes = null;
        }

        @Override
        public void removed(Item element) {
            logger.debug("Invalidating cached item named attributes");
            itemAttributes = null;
        }

        @Override
        public void updated(Item oldElement, Item element) {
            logger.debug("Invalidating cached item named attributes");
            itemAttributes = null;
        }
    };

    private @NonNull RegistryChangeListener<Metadata> metadataRegistryChangeListener = new RegistryChangeListener<Metadata>() {
        @Override
        public void added(Metadata element) {
            if (element.getUID().getNamespace() == "habot") {
                logger.debug("Invalidating cached item named attributes");
                itemAttributes = null;
            }
        }

        @Override
        public void removed(Metadata element) {
            if (element.getUID().getNamespace() == "habot") {
                logger.debug("Invalidating cached item named attributes");
                itemAttributes = null;
            }
        }

        @Override
        public void updated(Metadata oldElement, Metadata element) {
            if (element.getUID().getNamespace() == "habot") {
                logger.debug("Invalidating cached item named attributes");
                itemAttributes = null;
            }
        }
    };
}
