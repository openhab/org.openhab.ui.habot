package org.openhab.ui.habot.card;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.openhab.ui.habot.card.internal.CardRegistry;
import org.openhab.ui.habot.nlp.Intent;
import org.osgi.service.component.annotations.Reference;

/**
 * Tries to come up with a {@link Card} to present with HABot's reply when asked about a set of entities.
 *
 * First, tries to look up in the registry ("card deck") for a card previously saved and having tags matching the
 * entities (for example: object:temperature + location:kitchen).
 *
 * If so, simply use that {@link Card} - this allows the user to control exactly what they want to see. If no card was
 * found, build one on the fly using the provided matching items. Note that the user will be allowed the opportunity to
 * add the ad-hoc card in the card deck, with the appropriate tags, and edit it so that it would appear with the
 * eventual customizations the next time.
 *
 * @author Yannick Schaus - Initial contribution
 *
 */
@org.osgi.service.component.annotations.Component(service = CardBuilder.class, immediate = true)
public class CardBuilder {

    private CardRegistry cardRegistry;
    private ItemRegistry itemRegistry;

    @Reference
    protected void setCardRegistry(CardRegistry cardRegistry) {
        this.cardRegistry = cardRegistry;
    }

    protected void unsetCardRegistry(CardRegistry cardRegistry) {
        this.cardRegistry = null;
    }

    @Reference
    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
    }

    public Card buildCard(Intent intent, List<Item> matchedItems) {
        Set<String> tags = intent.getEntities().entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.toSet());
        Collection<Card> cardsInRegistry = this.cardRegistry.getCardByTags(tags);
        if (cardsInRegistry.size() > 0) {
            // don't handle multiple cards, just return the first one
            return cardsInRegistry.iterator().next();
        }

        Card card = new Card("HbCard");
        card.addTags(tags);
        card.updateTimestamp();

        if (matchedItems.size() == 1) {
            Item item = matchedItems.get(0);
            card.setTitle(item.getLabel());
            card.setSubtitle(item.getName());

            Component component = new Component("HbSingleItemValue");
            component.addConfig("item", item.getName());
            component.addConfig("type", item.getType());

            card.addComponent("right", component);
        } else {
            // TODO: maybe figure out a title for the card
            card.setTitle(getCardTitleFromGroupLabels(tags));
            card.setSubtitle(matchedItems.size() + " items"); // TODO: i18n

            Component list = new Component("HbList");
            for (Item item : matchedItems) {
                Component listItem = new Component("HbListItem");
                listItem.addConfig("item", item.getName());
                listItem.addConfig("label", item.getLabel());
                listItem.addConfig("type", item.getType());

                list.addComponent("items", listItem);
            }

            card.addComponent("list", list);
        }

        return card;
    }

    private String getCardTitleFromGroupLabels(Set<String> tags) {
        Collection<Item> groups = this.itemRegistry.getItemsByTagAndType("Group", tags.stream().toArray(String[]::new));
        if (groups.isEmpty()) {
            return "";
        } else {
            return groups.stream().map(i -> i.getLabel()).collect(Collectors.joining(", "));
        }
    }
}
