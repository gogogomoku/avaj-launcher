package com.ersesk.simulation;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height){
        this.longitude=longitude;
        this.latitude=latitude;
        this.height=height;
    }

    public String toString() {
        return String.format("[debug] (lng: %d, lat: %d), hgt: %d\n", this.longitude, this.latitude, this.height);
    }

    public void setLongitude(int value){
        if (value < 0) {
            value = 0;
        }
        this.longitude = value;
    }

    public void setLatitude(int value){
        if (value < 0) {
            value = 0;
        }
        this.latitude = value;
    }

    public void setHeight(int value){
        if (value < 0) {
            value = 0;
        } else if (value > 100) {
            value = 100;
        }
        this.height = value;
    }

    public int getLongitude(){
        return longitude;
    }

    public int getLatitude(){
        return latitude;
    }

    public int getHeight(){
        return height;
    }
}
