package org.openhab.ui.habot.nlp.internal;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.stream.Stream;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
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

/**
 * This class resolves items and provide name samples using Eclipse SmartHome's semantics feature.
 *
 * @author Yannick Schaus
 */
@Component(service = ItemResolver.class, immediate = true)
public class SemanticsItemResolver implements ItemResolver {

    ItemRegistry itemRegistry;
    SemanticsService semanticsService;
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
            try {
                items = semanticsService.getItemsInLocation(location, currentLocale).stream();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
            }
        } else {
            items = new HashSet<Item>(itemRegistry.getAll()).stream();
        }

        if (object != null) {
            Class<? extends Tag> semanticTagType = SemanticTags.getByLabelOrSynonym(object, currentLocale);
            if (semanticTagType != null && !Location.class.isAssignableFrom(semanticTagType)) {
                if (Property.class.isAssignableFrom(semanticTagType)) {
                    items = items.filter(SemanticsPredicates.relatesTo((Class<? extends Property>) semanticTagType));
                } else {
                    items = items.filter(SemanticsPredicates.isA(semanticTagType));
                }
            } else {
                return Stream.empty();
            }
        }

        return items;
    }

    @Override
    public InputStream getNameSamples() throws UnsupportedLanguageException {
        // TODO Auto-generated method stub
        return null;
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
    public void setSemanticsService(SemanticsService semanticsService) {
        this.semanticsService = semanticsService;
    }

    public void unsetSemanticsService(SemanticsService SemanticsService) {
        this.semanticsService = null;
    }

}
