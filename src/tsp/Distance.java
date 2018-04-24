package tsp;

public class Distance {

    public static double calculateDistance(City firstCity, City secondCity){
        double result;

        result = (secondCity.getCoordinateX() - firstCity.getCoordinateX()) * (secondCity.getCoordinateX() - firstCity.getCoordinateX());
        result += (secondCity.getCoordinateY() - firstCity.getCoordinateY()) * (secondCity.getCoordinateY() - firstCity.getCoordinateY());
        result = Math.sqrt(result);

        return result;
    }
}
