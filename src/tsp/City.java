package tsp;

public class City {
    public City(int cityNumber, double coordinateX, double coordinateY) {
        this.cityNumber = cityNumber;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCityNumber() {
        return cityNumber;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    private int cityNumber;
    private double coordinateX;
    private double coordinateY;
}
