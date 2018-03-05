package org.openhab.ui.habot.card.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.smarthome.core.common.registry.AbstractRegistry;
import org.eclipse.smarthome.core.events.EventPublisher;
import org.openhab.ui.habot.card.Card;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(service = CardRegistry.class, immediate = true)
public class CardRegistry extends AbstractRegistry<Card, String, CardProvider> {

    public CardRegistry() {
        super(CardProvider.class);
    }

    public Collection<Card> getCardByTags(Set<String> tags) {
        List<Card> filteredCards = new ArrayList<Card>();
        for (Card card : getAll()) {
            if (cardHasTags(card, tags)) {
                filteredCards.add(card);
            }
        }
        return filteredCards;
    }

    /*
     * NOTE: unlike the ItemRegistry this method returns true only has ALL the provided tags!
     */
    private boolean cardHasTags(Card card, Set<String> tags) {
        return (tags != null && card.getTags() != null && card.getTags().equals(tags));
    }

    @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
    protected void setManagedProvider(CardProvider provider) {
        super.setManagedProvider(provider);
    }

    protected void unsetManagedProvider(CardProvider provider) {
        super.unsetManagedProvider(provider);
    }

    @Override
    @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
    protected void setEventPublisher(EventPublisher eventPublisher) {
        super.setEventPublisher(eventPublisher);
    }

    @Override
    protected void unsetEventPublisher(EventPublisher eventPublisher) {
        super.unsetEventPublisher(eventPublisher);
    }
}
