package aircraft;

public abstract class Aircraft {
	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private static long idCounter;

	static{
		idCounter = 0;
	}

	// needs Coordinates
	protected Aircraft(long id, String name, Coordinates coordinates) {
			this.id = id;
			this.name = name;
			this.coordinates = coordinates;
	}

	// private long nextId() {
	// 	// return some long;
	// }
}