/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.card;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.common.registry.Identifiable;
import org.openhab.ui.habot.card.internal.CardRegistry;
import org.openhab.ui.habot.nlp.Intent;

/**
 * A card is a special type of {@link Component} at the root of the hierarchy.
 * It has a number of specific parameters, a set of tags, a timestamp, and is
 * identifiable by its UID (generally a GUID).
 *
 * @author Yannick Schaus
 */
public class Card extends Component implements Identifiable<String> {
    @NonNull
    String uid;

    String title;
    String subtitle;

    Set<String> tags = new HashSet<String>();

    boolean bookmarked;
    boolean notReuseableInChat;
    boolean addToDeckDenied;
    boolean ephemeral;

    Date timestamp;

    /**
     * Constructs a card.
     *
     * @param name the name of the UI component to render the card on client frontends, ie. "HbCard"
     */
    @SuppressWarnings("null")
    public Card(String name) {
        super(name);
        this.uid = UUID.randomUUID().toString();
    }

    /**
     * Constructs a Card with a specific UID.
     *
     * @param uid the UID of the new card
     * @param name the name of the UI component to render the card on client frontends, ie. "HbCard"
     */
    public Card(@NonNull String uid, String name) {
        super(name);
        this.uid = uid;
    }

    @Override
    @NonNull
    public String getUID() {
        return uid;
    }

    /**
     * Gets the card's title
     *
     * @return the card title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the card's title
     *
     * @param title the card title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the card's subtitle
     *
     * @return the card subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the card's subtitle
     *
     * @param subtitle the card subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * Gets the set of tags attached to the card
     *
     * @return the card tags
     */
    public Set<String> getTags() {
        return tags;
    }

    /**
     * Returns whether the card is bookmarked (appears on a dedicated "bookmarks" page)
     *
     * @return the card bookmark status
     */
    public boolean isBookmarked() {
        return bookmarked;
    }

    /**
     * Specifies whether the card is bookmarked or not (appears on a dedicated "bookmarks" page)
     *
     * @param bookmarked the card bookmark status
     */
    public void setBookmark(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    /**
     * Returns whether the card should be ignored during the chat sessions, even if its tags match an @link
     * {@link Intent}'s extracted entities.
     *
     * @return true if the card is not be considered during chat sessions, false (default) otherwise
     */
    public boolean isNotReuseableInChat() {
        return notReuseableInChat;
    }

    /**
     * Specifies whether the card should be ignored during the chat sessions, even if its tags match an @link
     * {@link Intent}'s extracted entities.
     *
     * @param notReuseableInChat true if the card is not be considered during chat sessions, false (default) otherwise
     */
    public void setNotReuseableInChat(boolean notReuseableInChat) {
        this.notReuseableInChat = notReuseableInChat;
    }

    /**
     * Returns whether the card can be added to the "card deck" permanently
     *
     * @return true if the card cannot be saved permanently, false (default) if it can
     */
    public boolean isAddToDeckDenied() {
        return addToDeckDenied;
    }

    /**
     * Returns whether the card can be added to the "card deck" permanently
     *
     * @param addToDeckDenied true if the card cannot be saved permanently, false (default) if it can
     */
    public void setAddToDeckDenied(boolean addToDeckDenied) {
        this.addToDeckDenied = addToDeckDenied;
    }

    /**
     * Returns whether the card is ephemeral, meaning it is not saved permanently to the @link {@link CardRegistry} and
     * will be purged after a number of newer ephemeral cards are added
     *
     * @return true if the card is ephemeral, false (default) otherwise
     */
    public boolean isEphemeral() {
        return ephemeral;
    }

    /**
     * Specifies whether the card is ephemeral, meaning it is not saved permanently to the @link {@link CardRegistry}
     * and will be purged once a number of newer ephemeral cards are added
     *
     * @return true if the card is ephemeral, false (default) otherwise
     */
    public void setEphemeral(boolean ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * Gets the timestamp of the card
     *
     * @return the timestamp
     */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * Sets the specified timestamp of the card
     *
     * @param date the timestamp
     */
    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    /**
     * Updates the timestamp of the card to the current date & time.
     */
    public void updateTimestamp() {
        this.timestamp = new Date();
    }

    /**
     * Returns whether the card has a certain tag
     *
     * @param tag the tag to check
     * @return true if the card is tagged with the specified tag
     */
    public boolean hasTag(String tag) {
        return (tags != null && tags.contains(tag));
    }

    /**
     * Adds a tag to the card
     *
     * @param tag the tag to add
     */
    public void addTag(String tag) {
        tags.add(tag);
    }

    /**
     * Adds several tags to the card
     *
     * @param tags the tags to add
     */
    public void addTags(Collection<String> tags) {
        this.tags.addAll(tags);
    }

    /**
     * Adds several tags to the card
     *
     * @param tags the tags to add
     */
    public void addTags(String... tags) {
        this.tags.addAll(Arrays.asList(tags));
    }

    /**
     * Removes a tag on a card
     *
     * @param tag the tag to remove
     */
    public void removeTag(String tag) {
        tags.remove(tag);
    }

    /**
     * Removes all tags on the card
     */
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
        if (!this.getUID().equals(other.getUID())) {
            return false;
        }
        return true;
    }

}
