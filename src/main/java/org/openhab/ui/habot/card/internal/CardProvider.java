package org.openhab.ui.habot.card.internal;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.smarthome.core.common.registry.DefaultAbstractManagedProvider;
import org.eclipse.smarthome.core.storage.StorageService;
import org.openhab.ui.habot.card.Card;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(service = CardProvider.class, immediate = true)
public class CardProvider extends DefaultAbstractManagedProvider<Card, String> {

    @Override
    protected String getStorageName() {
        return "habot_cards";
    }

    @Override
    protected @NonNull String keyToString(@NonNull String key) {
        return key;
    }

    @Reference(policy = ReferencePolicy.DYNAMIC)
    @Override
    protected void setStorageService(StorageService storageService) {
        super.setStorageService(storageService);
    }

    @Override
    protected void unsetStorageService(StorageService storageService) {
        super.unsetStorageService(storageService);
    }
}
