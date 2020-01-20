package com.ersesk.simulation;
import java.util.HashMap;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private HashMap<String, String> weatherMessages;

    public JetPlane(String name, Coordinates coordinates){
        super(name, coordinates);
        weatherMessages = new HashMap<>();
        weatherMessages.put("FOG", "I am a JET_PLANE in the FOG");
        weatherMessages.put("RAIN", "I am a JET_PLANE in the RAIN");
        weatherMessages.put("SNOW", "I am a JET_PLANE in the SNOW");
        weatherMessages.put("SUN", "I am a JET_PLANE in the SUN");
    }

    private void setNewCoordinates(String weather) {
        switch (weather) {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLatitude(coordinates.getLatitude() + 10);
                break;
            case "RAIN":
                coordinates.setLatitude(coordinates.getLatitude() + 5);
                break;
            case "FOG":
                coordinates.setLatitude(coordinates.getLatitude() + 1);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 7);
                break;
        }
        // System.out.println(coordinates.toString());
        this.logAircraftMessage(weatherMessages.get(weather));
    }

    public void updateConditions(){
        String weather = this.weatherTower.getWeather(coordinates);
        setNewCoordinates(weather);
        if (coordinates.getHeight() == 0){
            land(weatherTower);
            weatherTower.unregister(this);
            weatherTower.logTowerMessage(this.toString(), "unregistered from weather tower.");
        }
    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        weatherTower.logTowerMessage(this.toString(), "registered to weather tower.");
    }
}
