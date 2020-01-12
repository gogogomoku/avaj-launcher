package aircraft;

public class Helicopter extends Aircraft implements Flyable {
    // private weahterTower WeatherTower

    public Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){

    }

    public void registerTower(/* WeatherTower WeatherTower */){

    }
}
