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

    protected void land(WeatherTower weatherTower){
        if (this.coordinates.getHeight() == 0){
            System.out.printf("%s %s landed at coordinates: (%d,%d,%d)\n",
                    this.getClass().getName(),
                    this.name,
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight()
                );

        }
    }
}
