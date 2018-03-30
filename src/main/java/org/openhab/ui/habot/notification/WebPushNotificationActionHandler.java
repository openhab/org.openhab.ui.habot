package org.openhab.ui.habot.notification;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.automation.Action;
import org.eclipse.smarthome.automation.handler.ActionHandler;
import org.eclipse.smarthome.automation.handler.BaseModuleHandler;
import org.openhab.ui.habot.notification.internal.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class WebPushNotificationActionHandler extends BaseModuleHandler<Action> implements ActionHandler {

    public static final String TYPE_ID = "habot.WebPushNotificationAction";
    public static final String PARAM_TITLE = "title";
    public static final String PARAM_BODY = "body";
    public static final String PARAM_CARD_UID = "cardUID";
    public static final String PARAM_TAGS = "tags";

    private final static Logger logger = LoggerFactory.getLogger(WebPushNotificationActionHandler.class);

    private final NotificationService notificationService;

    public WebPushNotificationActionHandler(Action module, NotificationService notificationService) {
        super(module);
        this.notificationService = notificationService;
    }

    @Override
    public @Nullable Map<@NonNull String, @NonNull Object> execute(
            @NonNull Map<@NonNull String, @NonNull Object> context) {
        String title = (String) module.getConfiguration().get(PARAM_TITLE);
        String body = (String) module.getConfiguration().get(PARAM_BODY);
        String cardUID = (String) module.getConfiguration().get(PARAM_CARD_UID);
        @SuppressWarnings("unchecked")
        List<Object> tags = (List<Object>) module.getConfiguration().get(PARAM_TAGS);

        try {
            Gson gson = new Gson();
            HashMap<String, Object> payload = new HashMap<String, Object>();
            payload.put("title", (title != null) ? title : "HABot");
            payload.put("body", body);
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
            logger.error("Error while sending the web push notification", e);
        }

        return null;
    }
}
