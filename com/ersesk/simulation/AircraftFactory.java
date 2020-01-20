package com.ersesk.simulation;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        Flyable f = null;
        if (type.equals("Helicopter")) {
            f = new Helicopter(name, coordinates);
        } else if (type.equals("Balloon") || type.equals("Baloon")) {
            f = new Balloon(name, coordinates);
        } else if (type.equals("JetPlane")) {
            f = new JetPlane(name, coordinates);
        }
        return f;
    }
}
