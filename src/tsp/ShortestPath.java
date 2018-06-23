package tsp;

public class ShortestPath {
    private static City currentCity;

    public static double findShortestPath(int cityNumber){
        currentCity = Cities.getCities().get(cityNumber);
        currentCity.setVisited(true);

        return calculateWholeDistance();
    }

    private static double calculateNearestCityDistance(){
        double distance = Double.MAX_VALUE;
        City nearestCity = new City();
        for(City city: Cities.getCities()){
            if(!city.isVisited()){
                if(Distance.makeCalculations(currentCity, city) < distance){
                    distance = Distance.makeCalculations(currentCity, city);
                    nearestCity = city;
                }
            }
        }
        currentCity = nearestCity;
        currentCity.setVisited(true);
        return distance;
    }

    private static double calculateWholeDistance(){
        double distance = 0;
        while(!checkIfAllCitiesAreVisited()){
            distance += calculateNearestCityDistance();
        }

        return distance;
    }

    private static boolean checkIfAllCitiesAreVisited(){
        boolean visited = true;
        for(City city : Cities.getCities()){
            if(!city.isVisited()){
                visited = false;
            }
        }
        return visited;
    }
}
