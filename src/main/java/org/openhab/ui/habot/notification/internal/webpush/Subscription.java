package org.openhab.ui.habot.notification.internal.webpush;

import org.eclipse.smarthome.core.common.registry.Identifiable;
import org.openhab.ui.habot.notification.internal.webpush.Subscription.Keys;

public class Subscription implements Identifiable<Keys> {
    public String endpoint;

    public Keys keys;

    public Subscription() {
        // No-args constructor
    }

    public Subscription(String endpoint, Keys keys) {
        this.endpoint = endpoint;
        this.keys = keys;
    }

    public class Keys {
        public String p256dh;

        public String auth;

        public Keys() {
            // No-args constructor
        }

        public Keys(String p256dh, String auth) {
            this.p256dh = p256dh;
            this.auth = auth;
        }
    }

    @Override
    public Keys getUID() {
        return keys;
    }
}
