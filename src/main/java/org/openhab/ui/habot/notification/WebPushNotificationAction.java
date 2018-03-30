package org.openhab.ui.habot.notification;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.smarthome.model.script.engine.action.ActionDoc;
import org.eclipse.smarthome.model.script.engine.action.ActionService;
import org.openhab.ui.habot.notification.internal.NotificationService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

@Component(service = { ActionService.class }, immediate = true)
public class WebPushNotificationAction implements ActionService {

    private final static Logger logger = LoggerFactory.getLogger(WebPushNotificationAction.class);

    private static NotificationService notificationService;

    @ActionDoc(text = "Sends a web push notification to all HABot subscribed clients")
    public static void sendHABotNotification(String message) {
        sendHABotNotificationExt("HABot", message, null, null);
    }

    @ActionDoc(text = "Sends a web push notification to all HABot subscribed clients")
    public static void sendHABotNotificationWithCard(String message, String cardUID) {
        sendHABotNotificationExt("HABot", message, cardUID, null);
    }

    @ActionDoc(text = "Sends a web push notification to all HABot subscribed clients")
    public static void sendHABotNotificationWithTags(String message, List<Object> tags) {
        sendHABotNotificationExt("HABot", message, null, tags);
    }

    @ActionDoc(text = "Sends a web push notification to all HABot subscribed clients")
    public static void sendHABotNotificationExt(String title, String message, String cardUID, List<Object> tags) {
        try {
            Gson gson = new Gson();
            HashMap<String, Object> payload = new HashMap<String, Object>();
            payload.put("title", title);
            payload.put("body", message);
            HashMap<String, Object> data = new HashMap<String, Object>();
            if (cardUID != null) {
                data.put("cardUID", cardUID);
            }
            if (tags != null) {
                data.put("tags", tags);
            }
            payload.put("data", data);

            String payloadJson = gson.toJson(payload);
            notificationService.broadcastNotification(payloadJson);
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
