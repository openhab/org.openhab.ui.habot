package org.openhab.ui.habot.card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Component {
    String component;

    Map<String, Object> config;

    Map<String, List<Component>> slots = null;

    public Component(String componentName) {
        super();
        this.component = componentName;
        this.config = new HashMap<String, Object>();
    }

    public String getName() {
        return component;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void addConfig(String key, Object value) {
        this.config.put(key, value);
    }

    public Map<String, List<Component>> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, List<Component>> slots) {
        this.slots = slots;
    }

    public List<Component> addSlot(String slotName) {
        if (slots == null) {
            slots = new HashMap<String, List<Component>>();
        }
        List<Component> newSlot = new ArrayList<Component>();
        this.slots.put(slotName, newSlot);

        return newSlot;
    }

    public List<Component> getSlot(String slotName) {
        return this.slots.get(slotName);
    }

    public void addComponent(String slotName, Component subComponent) {
        List<Component> slot;
        if (slots == null || !slots.containsKey(slotName)) {
            slot = addSlot(slotName);
        } else {
            slot = getSlot(slotName);
        }

        slot.add(subComponent);
    }
}
