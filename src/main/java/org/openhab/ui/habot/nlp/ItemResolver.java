/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.nlp;

import java.io.InputStream;
import java.util.Locale;
import java.util.stream.Stream;

import org.eclipse.smarthome.core.items.Item;
import org.openhab.ui.habot.nlp.internal.IntentTrainer;

import opennlp.tools.namefind.NameSample;

/**
 * This interface is used to find items matching entities extracted from the
 * user natural language query: object - "what" and location - "where". It also acts as a supplemental source of @link
 * {@link NameSample} for the {@link IntentTrainer}
 *
 * @author Yannick Schaus
 */
public interface ItemResolver {

    /**
     * Sets the current locale.
     * Attributes derived from semantic tags will use this locale.
     * This will invalidate the attribute cache.
     *
     * @param locale
     */
    void setLocale(Locale locale) throws UnsupportedLanguageException;

    /**
     * Returns items matching the provided object and locations in the
     * current locale.
     * If a non-null object and a non-null location are provided,
     * items shall match both.
     *
     * @param object the object to find
     * @param location the location to find
     * @return a stream of matching items (groups included)
     */
    Stream<Item> getMatchingItems(String object, String location);

    /**
     * Get an {@link InputStream} of additional name samples to feed to
     * the {@link IntentTrainer} to improve the recognition.
     *
     * @return an OpenNLP compatible input stream with the tagged name samples on separate lines
     */
    InputStream getNameSamples() throws UnsupportedLanguageException;

}