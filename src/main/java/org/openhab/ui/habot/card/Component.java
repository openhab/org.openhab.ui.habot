package org.openhab.ui.habot.card;

import java.util.HashMap;
import java.util.Map;

public class Component {
    String name;

    Map<String, Object> config;

    Map<String, Slot> slots = null;

    public Component(String name) {
        super();
        this.name = name;
        this.config = new HashMap<String, Object>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void addConfig(String key, Object value) {
        this.config.put(key, value);
    }

    public Map<String, Slot> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, Slot> slots) {
        this.slots = slots;
    }

    public Slot addSlot(String slotName) {
        if (slots == null) {
            slots = new HashMap<String, Slot>();
        }
        Slot newSlot = new Slot(slotName);
        this.slots.put(slotName, newSlot);

        return newSlot;
    }

    public Slot getSlot(String slotName) {
        return this.slots.get(slotName);
    }
}
