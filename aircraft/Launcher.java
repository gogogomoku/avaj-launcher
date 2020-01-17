package aircraft;

public class Launcher {
	public Launcher() {
		int iterations = 40;
		Flyable h1 = AircraftFactory.newAircraft("Helicopter", "Helicopter1", 1, 2, 3);
        Flyable b1 = AircraftFactory.newAircraft("Balloon", "Balloon1", 15, 8, 12);
		Flyable j1 = AircraftFactory.newAircraft("JetPlane", "JetPlane1", 12, 18, 6);
		WeatherTower tower = new WeatherTower();
		h1.registerTower(tower);
        b1.registerTower(tower);
		j1.registerTower(tower);

		for (int i = 0; i < iterations; i++){
				tower.changeWeather();
		}
	}
}
