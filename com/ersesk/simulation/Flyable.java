package com.ersesk.simulation;

public interface Flyable {
    public void updateConditions();

    public void registerTower(WeatherTower weatherTower);
}
