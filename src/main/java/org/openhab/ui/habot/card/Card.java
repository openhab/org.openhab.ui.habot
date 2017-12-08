package org.openhab.ui.habot.card;

import java.util.List;

public class Card extends Component {
    String title;
    String subtitle;

    String imageUri;

    List<CardAction> actions;

    public Card(String name) {
        super(name);
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
