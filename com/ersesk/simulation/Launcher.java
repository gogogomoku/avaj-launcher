package com.ersesk.simulation;

import com.ersesk.parser.*;
import java.util.*;

public class Launcher {
	public int nSims;

	public Launcher(int nSims, ArrayList<AircraftData> aircraftDataList) {
		WeatherTower tower = new WeatherTower();
		for (AircraftData item : aircraftDataList) {
			createAircraft(item, tower);
		}
		for (int i = 0; i < nSims; i++) {
			tower.changeWeather();
		}
	}

	private void createAircraft(AircraftData aircraftData, WeatherTower tower) {
		Flyable f = AircraftFactory.newAircraft(aircraftData.type, aircraftData.name, aircraftData.longitude,
				aircraftData.latitude, aircraftData.height);
		f.registerTower(tower);
	}

	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Main <filename>");
			System.exit(0);
		} else {
			Parser parser = new Parser(args[0]);
			new Launcher(parser.nSims, parser.aircraftData);
			System.out.print("Done, exiting.");
			System.exit(0);
		}
	}
}
