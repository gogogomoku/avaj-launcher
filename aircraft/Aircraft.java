package aircraft;

public abstract class Aircraft {
	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private static long idCounter;

	static {
		idCounter = 0;
	}

	protected Aircraft(String name, Coordinates coordinates) {
			this.name = name;
			this.coordinates = coordinates;
            this.id = nextId();
	}

	private static long nextId() {
        idCounter++;
        return idCounter;
	}
}
