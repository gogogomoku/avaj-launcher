package aircraft;

public class Launcher {
	public Launcher() {
		System.out.print("Launcher instantiated!");
		int iterations = 4;
		Flyable h1 = AircraftFactory.newAircraft("Helicopter", "name1", 1, 2, 3);
		Flyable h2 = AircraftFactory.newAircraft("Helicopter", "name2", 1, 2, 3);
		WeatherTower tower = new WeatherTower();
		h1.registerTower(tower);
		h2.registerTower(tower);

		for (int i = 0; i < iterations; i++){
				tower.changeWeather();
		}
	}
}