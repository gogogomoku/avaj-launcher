package aircraft;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    };

    protected void changeWeather() {
        this.conditionsChanged();
    };
}
