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
    public void unregister(Flyable flyable) {};
    protected void conditionsChanged() {};
}
