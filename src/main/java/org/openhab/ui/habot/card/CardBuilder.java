package org.openhab.ui.habot.card;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.library.CoreItemFactory;
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

        Collection<Card> cardsInRegistry = this.cardRegistry.getCardByTags(tags).stream()
                .filter(c -> !c.isNotReuseableInChat()).collect(Collectors.toList());
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

            switch (item.getType()) {
                case CoreItemFactory.SWITCH:
                    Component switchComponent = new Component("HbSwitch");
                    switchComponent.addConfig("item", item.getName());
                    card.addComponent("right", switchComponent);
                    break;
                case CoreItemFactory.DIMMER:
                    // Component dimmerValueComponent = new Component("HbSingleItemValue");
                    // dimmerValueComponent.addConfig("item", item.getName());
                    // card.addComponent("right", dimmerValueComponent);
                    Component dimmerSwitchComponent = new Component("HbSwitch");
                    dimmerSwitchComponent.addConfig("item", item.getName());
                    card.addComponent("right", dimmerSwitchComponent);
                    Component dimmerContainerComponent = new Component("HbContainer");
                    dimmerContainerComponent.addConfig("classes", new String[] { "full-width", "text-center" });
                    Component sliderComponent = new Component("HbSlider");
                    sliderComponent.addConfig("item", item.getName());
                    dimmerContainerComponent.addComponent("main", sliderComponent);
                    card.addComponent("main", dimmerContainerComponent);
                    break;
                case CoreItemFactory.ROLLERSHUTTER:
                    Component shutterValueComponent = new Component("HbSingleItemValue");
                    shutterValueComponent.addConfig("item", item.getName());
                    card.addComponent("right", shutterValueComponent);
                    Component shutterContainerComponent = new Component("HbContainer");
                    shutterContainerComponent.addConfig("classes", new String[] { "full-width", "text-center" });
                    Component shutterControlComponent = new Component("HbShutterControl");
                    shutterControlComponent.addConfig("item", item.getName());
                    shutterControlComponent.addConfig("size", "lg");
                    shutterControlComponent.addConfig("rounded", true);
                    shutterControlComponent.addConfig("glossy", true);
                    shutterControlComponent.addConfig("push", true);
                    shutterControlComponent.addConfig("stopIcon", "close");
                    shutterContainerComponent.addComponent("main", shutterControlComponent);
                    card.addComponent("main", shutterContainerComponent);
                    break;
                default:
                    // TODO: display in the main slot instead, depending on the width of the (transformed) state
                    Component singleItemComponent = new Component("HbSingleItemValue");
                    singleItemComponent.addConfig("item", item.getName());
                    card.addComponent("right", singleItemComponent);
                    break;

            }

        } else {
            card.setTitle(getCardTitleFromGroupLabels(tags));
            card.setSubtitle(matchedItems.size() + " items"); // TODO: i18n

            Component list = new Component("HbList");
            for (Item item : matchedItems) {
                Component listItem = new Component("HbListItem");
                listItem.addConfig("item", item.getName());
                listItem.addConfig("label", item.getLabel());

                list.addComponent("items", listItem);
            }

            card.addComponent("list", list);
        }

        return card;
    }

    public Card buildChartCard(Intent intent, List<Item> matchedItems, String period) {
        Set<String> tags = intent.getEntities().entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.toSet());

        Card card = new Card("HbCard");
        card.addTags(tags);
        card.updateTimestamp();

        if (matchedItems.size() == 1) {
            Item item = matchedItems.get(0);
            card.setTitle(item.getLabel());
            card.setSubtitle(item.getName());
        } else {
            card.setTitle(getCardTitleFromGroupLabels(tags));
            card.setSubtitle(matchedItems.size() + " items"); // TODO: i18n
        }

        Component chart = new Component("HbChartImage");
        chart.addConfig("items",
                matchedItems.stream().map(i -> i.getName()).collect(Collectors.toList()).toArray(new String[0]));
        chart.addConfig("period", period);

        Component analyzeButton = new Component("HbAnalyzeActionButton");
        analyzeButton.addConfig("items", chart.getConfig().get("items"));
        analyzeButton.addConfig("period", chart.getConfig().get("period"));

        card.addComponent("media", chart);
        card.addComponent("actions", analyzeButton);

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
