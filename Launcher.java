import aircraft.*;

public class Launcher {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Launcher <filename>");
			System.exit(0);
		} else {
			System.out.println(args[0]);
            Flyable h1 = AircraftFactory.newAircraft("Helicopter", "name1", 1, 2, 3);
			Flyable h2 = AircraftFactory.newAircraft("Helicopter", "name2", 1, 2, 3);
            System.out.println(h1);
			System.out.println(h2);
            WeatherTower tower = new WeatherTower();
            tower.register(h1);
            tower.register(h2);
            for (int i = 0; i < 2; i++){
                System.out.println("New cycle");
            }
		}
	}
}
