/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.nlp.internal;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemPredicates;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.Metadata;
import org.eclipse.smarthome.core.items.MetadataKey;
import org.eclipse.smarthome.core.items.MetadataRegistry;
import org.eclipse.smarthome.core.semantics.SemanticTags;
import org.eclipse.smarthome.core.semantics.SemanticsPredicates;
import org.eclipse.smarthome.core.semantics.SemanticsService;
import org.eclipse.smarthome.core.semantics.model.Location;
import org.eclipse.smarthome.core.semantics.model.Property;
import org.eclipse.smarthome.core.semantics.model.Tag;
import org.openhab.ui.habot.nlp.ItemResolver;
import org.openhab.ui.habot.nlp.UnsupportedLanguageException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class resolves items and provide name samples using Eclipse SmartHome's semantics feature.
 *
 * @author Yannick Schaus
 */
@Component(service = ItemResolver.class, immediate = true)
public class SemanticsItemResolver implements ItemResolver {

    private final Logger logger = LoggerFactory.getLogger(SemanticsItemResolver.class);

    private static final String SYNONYMS_NAMESPACE = "synonyms";

    private ItemRegistry itemRegistry;
    private MetadataRegistry metadataRegistry;
    private SemanticsService semanticsService;
    private Locale currentLocale = null;

    @Override
    public void setLocale(Locale locale) {
        if (locale == null) {
            this.currentLocale = Locale.ENGLISH;
        } else {
            this.currentLocale = locale;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Stream<Item> getMatchingItems(String object, String location) {
        Stream<Item> items;
        if (location != null) {
            items = semanticsService.getItemsInLocation(location, currentLocale).stream();
        } else {
            items = new HashSet<Item>(itemRegistry.getAll()).stream();
        }

        if (object != null) {
            Class<? extends Tag> semanticTagType = SemanticTags.getByLabelOrSynonym(object, currentLocale);
            if (semanticTagType != null && !Location.class.isAssignableFrom(semanticTagType)) {
                Predicate<Item> predicate = Property.class.isAssignableFrom(semanticTagType)
                        ? SemanticsPredicates.relatesTo((Class<? extends Property>) semanticTagType)
                        : SemanticsPredicates.isA(semanticTagType);
                items = items.filter(ItemPredicates.hasLabel(object).or(hasSynonym(object)).or(predicate));
            } else {
                return items.filter(ItemPredicates.hasLabel(object).or(hasSynonym(object)));
            }
        }

        return items;
    }

    @Override
    public InputStream getNameSamples() throws UnsupportedLanguageException {
        StringBuilder nameSamplesDoc = new StringBuilder();

        for (Item item : itemRegistry.getAll()) {
            Class<? extends Tag> semanticType = SemanticTags.getSemanticType(item);
            if (semanticType != null) {
                String nameSampleType = (Location.class.isAssignableFrom(semanticType)) ? "location" : "object";

                // Add the item's label
                appendNameSample(nameSamplesDoc, nameSampleType, item.getLabel());

                // Add the primary type's label and synonyms
                for (String tagNameSample : SemanticTags.getLabelAndSynonyms(semanticType, currentLocale)) {
                    appendNameSample(nameSamplesDoc, nameSampleType, tagNameSample);
                }

                // Add the related property's label and synonyms
                Class<? extends Property> relatedProperty = SemanticTags.getProperty(item);
                if (relatedProperty != null) {
                    for (String propertyNameSample : SemanticTags.getLabelAndSynonyms(relatedProperty, currentLocale)) {
                        appendNameSample(nameSamplesDoc, "object", propertyNameSample);
                    }
                }

                // Add the user-specified synonyms (in the "synonyms" item metadata namespace)
                MetadataKey key = new MetadataKey(SYNONYMS_NAMESPACE, item.getName());
                Metadata md = metadataRegistry.get(key);
                if (md != null) {
                    String[] synonyms = md.getValue().split(",");
                    for (String synonym : synonyms) {
                        appendNameSample(nameSamplesDoc, nameSampleType, synonym);
                    }
                }
            }
        }

        // logger.debug("Additional name samples: {}", nameSamplesDoc.toString());
        return IOUtils.toInputStream(nameSamplesDoc.toString());
    }

    private void appendNameSample(StringBuilder nameSamplesDoc, String type, String value) {
        nameSamplesDoc.append(String.format("<START:%s> %s <END>%n", type, value));
    }

    private Predicate<? super Item> hasSynonym(String labelOrSynonym) {
        return item -> {
            MetadataKey key = new MetadataKey(SYNONYMS_NAMESPACE, item.getName());
            Metadata md = metadataRegistry.get(key);
            if (md != null) {
                String[] synonyms = md.getValue().split(",");
                for (String synonym : synonyms) {
                    if (synonym.equalsIgnoreCase(labelOrSynonym)) {
                        return true;
                    }
                }
            }
            return false;
        };
    }

    @Reference
    protected void setItemRegistry(ItemRegistry itemRegistry) {
        if (this.itemRegistry == null) {
            this.itemRegistry = itemRegistry;
        }
    }

    protected void unsetItemRegistry(ItemRegistry itemRegistry) {
        if (itemRegistry == this.itemRegistry) {
            this.itemRegistry = null;
        }
    }

    @Reference
    protected void setMetadataRegistry(MetadataRegistry metadataRegistry) {
        if (this.metadataRegistry == null) {
            this.metadataRegistry = metadataRegistry;
        }
    }

    protected void unsetMetadataRegistry(MetadataRegistry metadataRegistry) {
        if (metadataRegistry == this.metadataRegistry) {
            this.metadataRegistry = null;
        }
    }

    @Reference
    public void setSemanticsService(SemanticsService semanticsService) {
        this.semanticsService = semanticsService;
    }

    public void unsetSemanticsService(SemanticsService SemanticsService) {
        this.semanticsService = null;
    }

}
