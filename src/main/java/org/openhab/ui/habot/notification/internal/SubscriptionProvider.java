package org.openhab.ui.habot.notification.internal;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.smarthome.core.common.registry.DefaultAbstractManagedProvider;
import org.eclipse.smarthome.core.storage.StorageService;
import org.openhab.ui.habot.notification.internal.webpush.Subscription;
import org.openhab.ui.habot.notification.internal.webpush.Subscription.Keys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(service = SubscriptionProvider.class, immediate = true)
public class SubscriptionProvider extends DefaultAbstractManagedProvider<Subscription, Keys> {

    @Override
    protected String getStorageName() {
        return "habot_webpush_subscriptions";
    }

    @Override
    protected @NonNull String keyToString(@NonNull Keys key) {
        return String.format("%s.%s", key.p256dh, key.auth);
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
