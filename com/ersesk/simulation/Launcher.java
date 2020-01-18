package com.ersesk.simulation;
import parser.AircraftData;
import java.util.*;

public class Launcher {
	public int nSims;

	public Launcher(int nSims, ArrayList<AircraftData> aircraftDataList) {
        WeatherTower tower = new WeatherTower();
        aircraftDataList.forEach((n) -> createAircraft(n, tower));
		for (int i = 0; i < nSims; i++){
				tower.changeWeather();
		}
	}

    private void createAircraft(AircraftData aircraftData, WeatherTower tower) {
        Flyable f = AircraftFactory.newAircraft(
            aircraftData.type,
            aircraftData.name,
            aircraftData.longitude,
            aircraftData.latitude,
            aircraftData.height
        );
		f.registerTower(tower);
    }


}
