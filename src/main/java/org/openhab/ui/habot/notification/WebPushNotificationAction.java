package org.openhab.ui.habot.notification;

import java.security.GeneralSecurityException;
import java.util.HashMap;

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
        try {
            Gson gson = new Gson();
            HashMap<String, Object> payload = new HashMap<String, Object>();
            payload.put("title", "HABot");
            payload.put("body", message);
            // HashMap<String, String> action1 = new HashMap<String, String>();
            // action1.put("action", "alarm");
            // action1.put("title", "Sound alarm");
            // HashMap<String, String> action2 = new HashMap<String, String>();
            // action2.put("action", "dismiss");
            // action2.put("title", "Dismiss");
            // payload.put("actions", new HashMap[] { action1, action2 });

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
