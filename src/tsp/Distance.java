package tsp;

public class Distance {

    public static double calculateDistance(){
        int firstCityNumber = getCityNumber();
        int secondCityNumber = getCityNumber();

        City firstCity = Cities.getCities().get(firstCityNumber);
        City secondCity = Cities.getCities().get(secondCityNumber);

        return makeCalculations(firstCity, secondCity);
    }

    private static int getCityNumber(){
        System.out.println("Enter city Number:");
        return Tsp.scan.nextInt();
    }

    private static double makeCalculations(City firstCity, City secondCity){
        double result;

        result = (secondCity.getCoordinateX() - firstCity.getCoordinateX()) * (secondCity.getCoordinateX() - firstCity.getCoordinateX());
        result += (secondCity.getCoordinateY() - firstCity.getCoordinateY()) * (secondCity.getCoordinateY() - firstCity.getCoordinateY());
        result = Math.sqrt(result);

        return result;
    }
}
