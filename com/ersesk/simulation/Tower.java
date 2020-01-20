package com.ersesk.simulation;

import java.util.*;

public abstract class Tower {
    private ArrayList<Flyable> observers;

    public void register(Flyable flyable) {
        if (this.observers == null) {
            this.observers = new ArrayList<Flyable>();
        }
        this.observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        this.observers.remove(flyable);
    };

    protected void conditionsChanged() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).updateConditions();
        }
    };

    public void logTowerMessage(String aircraftStr, String message) {
        Launcher.getWriter().printf("Tower says: %s %s\n", aircraftStr, message);
    }
}
