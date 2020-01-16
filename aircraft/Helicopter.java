package aircraft;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weahterTower;

    public Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){
        // String str = tower.getWeather(this.coordinates);
        // System.out.println(str);
    }

    public void registerTower(WeatherTower weatherTower){

    }
}
