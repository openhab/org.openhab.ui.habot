/**
 * Copyright (c) 2015-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.dashboard.internal;

import org.openhab.ui.dashboard.DashboardTile;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The dashboard tile and resource registering for HABot
 *
 * @author Yannick Schaus
 *
 */
@Component(service = DashboardTile.class, immediate = true, property = { "service.config.description.uri=ui:habot",
        "service.config.label=HABot", "service.config.category=ui" })
public class HABotDashboardTile implements DashboardTile {

    @Override
    public String getName() {
        return "HABot";
    }

    @Override
    public String getUrl() {
        return "../habot/index.html";
    }

    @Override
    public String getOverlay() {
        return null;
    }

    @Override
    public String getImageUrl() {
        return "../habot/statics/tile.png";
    }

    public static final String HABOT_ALIAS = "/habot";

    private static final Logger logger = LoggerFactory.getLogger(HABotDashboardTile.class);

    protected HttpService httpService;

    @Activate
    protected void activate() {
        try {
            httpService.registerResources(HABOT_ALIAS, "web/dist", null);
            logger.info("Started HABot at " + HABOT_ALIAS);
        } catch (NamespaceException e) {
            logger.error("Error during HABot startup: {}", e.getMessage());
        }
    }

    @Deactivate
    protected void deactivate() {
        httpService.unregister(HABOT_ALIAS);
        logger.info("Stopped HABot");
    }

    @Reference
    protected void setHttpService(HttpService httpService) {
        this.httpService = httpService;
    }

    protected void unsetHttpService(HttpService httpService) {
        this.httpService = null;
    }

}
