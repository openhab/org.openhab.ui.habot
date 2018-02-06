package org.openhab.ui.habot.nlp;

import java.util.HashMap;
import java.util.Map;

public class Intent {
    String name;

    Map<String, String> entities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getEntities() {
        return entities;
    }

    public void setEntities(Map<String, String> slots) {
        this.entities = slots;
    }

    @Override
    public String toString() {
        return "Intent [name=" + name + ", entities=" + entities + "]";
    }

    public Intent(String name) {
        this.name = name;
        this.entities = new HashMap<String, String>();
    }
}
