import AircraftFactory.*;

public class Launcher {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Launcher <filename>");
			System.exit(0);
		} else {
			System.out.println(args[0]);
			String factory = AircraftFactory.newAircraft("name", "", 1, 2, 3);
			System.out.println(factory);
		}
	}
}
