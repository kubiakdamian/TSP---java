package tsp;

public class City {
    private int cityNumber;
    private double coordinateX;
    private double coordinateY;

    public City(double coordinateX, double coordinateY) {
        this.cityNumber = Cities.getCities().size();
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
}
