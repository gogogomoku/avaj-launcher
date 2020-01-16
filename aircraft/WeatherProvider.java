package aircraft;

public class WeatherProvider {
    private WeatherProvider weatherProvider;
    private String[] weather;
    private WeatherProvider(){
        self.weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
    }
    public getProvider(){
        if (this.weatherProvider == Null){
            this.weatherprovider = new WeatherProvider();
        }
        return this.weatherProvider;
    }
    public String getCurrentWeather(Coordinates coordinates){
        int rnd = new Random().nextInt(weather.length);
        return weather[rnd];
    }
}
