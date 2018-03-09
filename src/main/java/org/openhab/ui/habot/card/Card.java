package org.openhab.ui.habot.card;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.common.registry.Identifiable;

public class Card extends Component implements Identifiable<String> {
    String uid;
    String title;
    String subtitle;

    Set<String> tags = new HashSet<String>();

    boolean bookmarked;
    boolean notReuseableInChat;
    boolean addToDeckDenied;

    Date timestamp;

    String imageUri;

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

    public Set<String> getTags() {
        return tags;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmark(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public boolean isNotReuseableInChat() {
        return notReuseableInChat;
    }

    public void setNotReuseableInChat(boolean notReuseableInChat) {
        this.notReuseableInChat = notReuseableInChat;
    }

    public boolean isAddToDeckDenied() {
        return addToDeckDenied;
    }

    public void setAddToDeckDenied(boolean addToDeckDenied) {
        this.addToDeckDenied = addToDeckDenied;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public void updateTimestamp() {
        this.timestamp = new Date();
    }

    public boolean hasTag(String tag) {
        return (tags != null && tags.contains(tag));
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void addTags(Collection<String> tags) {
        this.tags.addAll(tags);
    }

    public void addTags(String... tags) {
        this.tags.addAll(Arrays.asList(tags));
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    public void removeAllTags() {
        tags.clear();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Card other = (Card) obj;
        if (this.getUID() == null) {
            if (other.getUID() != null) {
                return false;
            }
        } else if (!this.getUID().equals(other.getUID())) {
            return false;
        }
        return true;
    }

}
