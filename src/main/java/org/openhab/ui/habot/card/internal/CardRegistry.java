package org.openhab.ui.habot.card.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.smarthome.core.common.registry.AbstractRegistry;
import org.eclipse.smarthome.core.events.EventPublisher;
import org.openhab.ui.habot.card.Card;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = CardRegistry.class, immediate = true)
public class CardRegistry extends AbstractRegistry<Card, String, CardProvider> {

    private final Logger logger = LoggerFactory.getLogger(CardRegistry.class);

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

    @Override
    public @NonNull Card add(@NonNull Card element) {
        // Remove old ephemeral cards
        Comparator<Card> byTimestamp = (e1, e2) -> e2.getTimestamp().compareTo(e1.getTimestamp());
        List<Card> oldCards = getAll().stream().filter(card -> card.isEphemeral()).sorted(byTimestamp).skip(10)
                .collect(Collectors.toList());

        for (Card card : oldCards) {
            logger.info("Removing old ephemeral card {}", card.getUID());
            remove(card.getUID());
        }

        return super.add(element);
    }

    public @NonNull Collection<Card> getRecent(int skip, int count) {
        int limit = (count < 1) ? 10 : count;
        Comparator<Card> byTimestamp = (e1, e2) -> e2.getTimestamp().compareTo(e1.getTimestamp());
        List<Card> recentCards = getAll().stream().sorted(byTimestamp).skip(skip).limit(limit)
                .collect(Collectors.toList());

        return recentCards;
    }

    public @NonNull Collection<Card> getNonEphemeral() {
        return getAll().stream().filter(c -> !c.isEphemeral()).collect(Collectors.toList());
    }

    /*
     * NOTE: unlike the ItemRegistry this method returns true only if the card has ALL the provided tags!
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
