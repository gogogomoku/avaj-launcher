
package aircraft;
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

    // Todo: Base on coordinates
    public String getCurrentWeather(Coordinates coordinates){
        int rnd = new Random().nextInt(weather.length);
        return weather[rnd];
    }
}
