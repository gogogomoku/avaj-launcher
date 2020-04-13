package com.ersesk.parser;

/*
AircraftData defines the data structure of every aircraft object.
This data is provided by the simulation file and is extracted from
it by the Parser class.
*/

public class AircraftData {
	public String type;
	public String name;
	public int longitude;
	public int latitude;
	public int height;

	public AircraftData(String type, String name, int longitude, int latitude, int height) {
		this.name = name;
		this.type = type;
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}
}
