/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.dashboard.internal;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;

import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

/**
 * An implementation of {@link HttpContext} which will handle the gzip-compressed assets.
 *
 * @author Yannick Schaus
 */
public class HABotHttpContext implements HttpContext {

    private HttpContext defaultHttpContext;

    /**
     * Constructs an {@link HABotHttpContext} with will another {@link HttpContext} as a base.
     *
     * @param defaultHttpContext the base {@link HttpContext} - use {@link HttpService#createDefaultHttpContext()} to
     *            create a default one
     */
    public HABotHttpContext(HttpContext defaultHttpContext) {
        this.defaultHttpContext = defaultHttpContext;
    }

    @Override
    public boolean handleSecurity(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Add the Content-Encoding: gzip header to the response for selected resources
        // (Disclaimer: I know, this is not the intended purpose of this method...)
        if (request.getRequestURI().endsWith(".css")
                || (request.getRequestURI().endsWith(".js") && request.getRequestURI().contains("/js/"))) {
            response.addHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
        }
        return defaultHttpContext.handleSecurity(request, response);
    }

    @Override
    public URL getResource(String name) {
        // Get the gzipped version for selected resources, built as static resources by webpack
        URL defaultResource = defaultHttpContext.getResource(name);
        if (name.endsWith(".css") || (name.endsWith(".js") && name.contains("/js/"))) {
            try {
                return new URL(defaultResource.toString() + ".gz");
            } catch (MalformedURLException e) {
                return defaultResource;
            }
        } else {
            return defaultResource;
        }
    }

    @Override
    public String getMimeType(String name) {
        return defaultHttpContext.getMimeType(name);
    }

}
