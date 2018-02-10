package org.openhab.ui.habot.card.internal;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.smarthome.core.common.registry.DefaultAbstractManagedProvider;
import org.openhab.ui.habot.card.Card;

public class CardProvider extends DefaultAbstractManagedProvider<Card, String> {

    @Override
    protected String getStorageName() {
        return "habot_cards";
    }

    @Override
    protected @NonNull String keyToString(@NonNull String key) {
        return key;
    }

}
