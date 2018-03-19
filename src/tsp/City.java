package tsp;

public class City {
    public City(int cityNumber, float coordinateX, float coordinateY) {
        this.cityNumber = cityNumber;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public float getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(float coordinateY) {
        this.coordinateY = coordinateY;
    }

    private int cityNumber;
    private float coordinateX;
    private float coordinateY;
}
