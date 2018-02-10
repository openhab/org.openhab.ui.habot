package org.openhab.ui.habot.card;

import java.util.List;

import org.eclipse.smarthome.core.common.registry.Identifiable;

public class Card extends Component implements Identifiable<String> {
    String uid;
    String title;
    String subtitle;

    String imageUri;

    List<CardAction> actions;

    public Card(String name) {
        super(name);
    }

    public Card(String uid, String name) {
        super(name);
        this.uid = uid;
    }

    @Override
    public String getUID() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public List<CardAction> getActions() {
        return actions;
    }

    public void setActions(List<CardAction> cardActions) {
        this.actions = cardActions;
    }

}
