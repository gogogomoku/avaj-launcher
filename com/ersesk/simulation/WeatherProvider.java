
package com.ersesk.simulation;
import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();

    private static String[] weather;

    private WeatherProvider() {
        weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
    }

    public static WeatherProvider getProvider() {
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        int rnd = new Random().nextInt(weather.length);
        return weather[(coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight() + rnd) % weather.length];
    }
}
