public class AircraftFactory {
	public static String newAircraft(String type, String name, int longitude, int latitude, int height) {
		return "String!";
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		String factoryResult = AircraftFactory.newAircraft("", "", 0, 0, 0);
		System.out.println(factoryResult);
	}
}
