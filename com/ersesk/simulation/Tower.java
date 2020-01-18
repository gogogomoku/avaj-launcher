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

    public void logMessage(long id, String name, String type, String message) {
        System.out.printf("Tower: %s#%s(%d)%s\n", type, name, id, message);
    }
}
