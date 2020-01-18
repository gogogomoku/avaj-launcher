package com.ersesk.parser;

public class AircraftData {
	public String name;
	public String type;
	public int longitude;
	public int latitude;
	public int height;

	public AircraftData(String name, String type, int longitude, int latitude, int height) {
		this.name = name;
		this.type = type;
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}
}