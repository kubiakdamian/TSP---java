package tsp;

import java.util.Arrays;

public class ShortestPath {

    public static double findShortestPath(int cityNumber){
        double wholeDistance = 0;
        int currentCityNumber = 56886;
        City currentCity = Cities.getCities().get(cityNumber);

        while(cityNumber != currentCityNumber) {
            wholeDistance += calculateSmallestDistance(currentCity);
            currentCityNumber = checkNearestCityNumber(currentCity);
            currentCity = Cities.getCities().get(currentCityNumber);
            currentCity.setVisited(true);
        }

        return wholeDistance;
    }

    private static double calculateSmallestDistance(City currentCity){
        double distance[] = new double[0];
        int i = 0;
        for(City city: Cities.getCities()){
            if(!city.isVisited()){
                distance[i] = Distance.makeCalculations(currentCity, city);
            }
            i++;
        }
        Arrays.sort(distance);
        return distance[0];
    }

    private static int checkNearestCityNumber(City currentCity){
        int cityNumber = 0;
        for(City city: Cities.getCities()){
            if(!city.isVisited()){
                if(calculateSmallestDistance(currentCity) == Distance.makeCalculations(currentCity, city)){
                    cityNumber = city.getCityNumber();
                }
            }
        }
        return cityNumber;
    }
}
