/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habot.nlp;

public class ItemNamedAttribute {
    public enum AttributeSource {
        TAG,
        METADATA
    }

    public ItemNamedAttribute(String type, String value, boolean inherited, AttributeSource source) {
        super();
        this.type = type;
        this.value = value;
        this.inherited = inherited;
        this.source = source;
    }

    String type;
    String value;
    boolean inherited;
    AttributeSource source;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isInherited() {
        return inherited;
    }

    public void setInherited(boolean inherited) {
        this.inherited = inherited;
    }

    public AttributeSource getSource() {
        return source;
    }

    public void setSource(AttributeSource source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (inherited ? 1231 : 1237);
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ItemNamedAttribute other = (ItemNamedAttribute) obj;
        // doesn't matter
        // if (inherited != other.inherited) {
        // return false;
        // }
        // if (source != other.source) {
        // return false;
        // }
        if (type == null) {
            if (other.type != null) {
                return false;
            }
        } else if (!type.equals(other.type)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

}
