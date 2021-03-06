package com.ersesk.simulation;

import com.ersesk.parser.*;
import java.util.*;
import java.io.*;

public class Launcher {
	public int nSims;
	public static boolean verbose;
	private static PrintWriter _combinedWriter;

	static {
		verbose = false;
	}

	public Launcher(int nSims, ArrayList<AircraftData> aircraftDataList) {
		try {
			Launcher._combinedWriter = new PrintWriter(new FileWriter("simulation.txt"));
		} catch (IOException e) {
			System.out.printf("Problem with creating logfile: %s\n", e);
			System.exit(1);
		}
		Launcher._combinedWriter.println("");
		WeatherTower tower = new WeatherTower();
		for (AircraftData item : aircraftDataList) {
			createAircraft(item, tower);
		}
		for (int i = 0; i < nSims; i++) {
			tower.changeWeather();
		}
		Launcher._combinedWriter.close();
	}

	public static PrintWriter getWriter() {
		return Launcher._combinedWriter;
	}

	private void createAircraft(AircraftData aircraftData, WeatherTower tower) {
		Flyable f = AircraftFactory.newAircraft(aircraftData.type, aircraftData.name, aircraftData.longitude,
				aircraftData.latitude, aircraftData.height);
		f.registerTower(tower);
	}

	public static void main(String[] args) {
		if (args.length == 2 && (args[0].equals("-v") || args[0].equals("--verbose"))) {
			Launcher.verbose = true;
		}
		if (!Launcher.verbose && args.length != 1) {
			System.out.println("Usage: java com.ersesk.simulation.Launcher [-v | --verbose] FILENAME");
			System.exit(0);
		} else {
			Parser parser = new Parser(Launcher.verbose ? args[1] : args[0]);
			if (!parser.getErrorMessage().isEmpty()) {
				System.out.printf("Exiting...\n");
				System.exit(1);
			}
			new Launcher(parser.nSims, parser.aircraftData);
			System.out.println("INFO: Done, exiting.");
			System.exit(0);
		}
	}
}
