package aircraft;
import java.util.HashMap;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private HashMap<String, String> weatherMessages;

    public Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
        weatherMessages = new HashMap<>();
        weatherMessages.put("FOG", "I am a helicopter in the FOG");
        weatherMessages.put("RAIN", "I am a helicopter in the RAIN");
        weatherMessages.put("SNOW", "I am a helicopter in the SNOW");
        weatherMessages.put("SUN", "I am a helicopter in the SUN");
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
        System.out.println(weatherMessages.get(weather));
    }

    public void updateConditions(){
        String weather = this.weatherTower.getWeather(coordinates);
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
