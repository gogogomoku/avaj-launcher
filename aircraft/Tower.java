package aircraft;
import java.util.*;

public abstract class Tower {
    private ArrayList<Flyable> observers;
    public void register(Flyable flyable) {
        if (this.observers == null) {
            this.observers = new ArrayList<Flyable>();
        }
        this.observers.add(flyable);
        System.out.println(this.observers);
    }
    public void unregister(Flyable flyable) {
        // todo: Do we need ID/name in this message
        System.out.printf("Tower: Unregistering a %s\n", flyable.getClass().getSimpleName());
        this.observers.remove(flyable);
    };

    protected void conditionsChanged() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).updateConditions();
        }

    };
}
