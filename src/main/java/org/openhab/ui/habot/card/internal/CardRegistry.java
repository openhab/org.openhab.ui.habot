package org.openhab.ui.habot.card.internal;

import org.eclipse.smarthome.core.common.registry.AbstractRegistry;
import org.openhab.ui.habot.card.Card;

public class CardRegistry extends AbstractRegistry<Card, String, CardProvider> {

    protected CardRegistry() {
        super(CardProvider.class);
    }

}
