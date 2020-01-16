package aircraft;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    private void setNewCoordinates(String weather) {
        switch (weather) {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLongitude(coordinates.getLongitude() + 10);
            case "RAIN":
                coordinates.setLongitude(coordinates.getLongitude() + 5);
            case "FOG":
                coordinates.setLongitude(coordinates.getLongitude() + 1);
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() + 12);
        }
    }

    public void updateConditions(){
        String weather = this.weatherTower.getWeather(coordinates);
        System.out.printf("The new weather is %s\n", weather);
        setNewCoordinates(weather);
        if (coordinates.getHeight() == 0){
            land(weatherTower);
            weatherTower.unregister(this);
        }
    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}
