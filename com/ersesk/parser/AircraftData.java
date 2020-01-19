package com.ersesk.parser;

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
