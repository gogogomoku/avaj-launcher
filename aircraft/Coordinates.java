package aircraft;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height){
        this.longitude=longitude;
        this.latitude=latitude;
        this.height=height;
    }

    public void setLongitude(int value){
        this.longitude = value;
    }

    public void setLatitude(int value){
        this.latitude = value;
    }

    public void setHeight(int value){
        this.height = value;
        if (this.height < 0) {
            this.height = 0;
        } else if (this.height > 100) {
            this.height = 100;
        }
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
