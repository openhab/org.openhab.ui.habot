package org.openhab.ui.habot.card;

import java.util.ArrayList;
import java.util.List;

public class Slot {
    String name;

    List<Component> components;

    public Slot(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public void addComponent(Component component) {
        if (this.components == null) {
            this.components = new ArrayList<Component>();
        }

        this.components.add(component);
    }
}
