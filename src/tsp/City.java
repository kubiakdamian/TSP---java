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

    public void setCityNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    private int cityNumber;
    private double coordinateX;
    private double coordinateY;
}
