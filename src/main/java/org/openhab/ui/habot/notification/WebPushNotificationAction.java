package org.openhab.ui.habot.notification;

import java.security.GeneralSecurityException;

import org.eclipse.smarthome.model.script.engine.action.ActionDoc;
import org.eclipse.smarthome.model.script.engine.action.ActionService;
import org.openhab.ui.habot.notification.internal.NotificationService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = { ActionService.class }, immediate = true)
public class WebPushNotificationAction implements ActionService {

    private final static Logger logger = LoggerFactory.getLogger(WebPushNotificationAction.class);

    private static NotificationService notificationService;

    @ActionDoc(text = "Sends a web push notification to all HABot subscribed clients")
    public static void sendHABotNotification(String payload) {
        try {
            // TODO: add more arguments and construct a rich payload for the clients
            notificationService.broadcastNotification(payload);
        } catch (GeneralSecurityException e) {
            logger.error("Error while sending web push notification", e);
        }
    }

    @Reference
    protected void setNotificationService(NotificationService notificationService) {
        WebPushNotificationAction.notificationService = notificationService;
    }

    protected void unsetNotificationService(NotificationService notificationService) {
        WebPushNotificationAction.notificationService = null;
    }

    @Override
    public String getActionClassName() {
        return WebPushNotificationAction.class.getCanonicalName();
    }

    @Override
    public Class<?> getActionClass() {
        return WebPushNotificationAction.class;
    }
}
