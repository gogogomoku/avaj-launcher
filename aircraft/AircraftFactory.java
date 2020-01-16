package aircraft;

public class AircraftFactory {
	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        System.out.println(type);
        if (type.equals("Helicopter")){
            Flyable helicopter = new Helicopter(name, coordinates);
            return helicopter;
        }
        return null;
	}


}
