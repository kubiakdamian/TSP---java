package tsp;

public class City {
    private int cityNumber;
    private double coordinateX;
    private double coordinateY;
    private boolean isVisited;

    public City(double coordinateX, double coordinateY) {
        this.cityNumber = Cities.getCities().size();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.isVisited = false;
    }

    public City(){}

    public int getCityNumber() {
        return cityNumber;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
