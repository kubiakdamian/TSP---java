package tsp;

import java.util.ArrayList;

public class Cities {
    public static ArrayList<City> getCities() {
        return cities;
    }

    private static ArrayList<City> cities = new ArrayList<>();

    public static void addCity(){
        double coordinateX = getCoordinateX();
        double coordinateY = getCoordinateY();

        City city = new City(coordinateX, coordinateY);
        cities.add(city);
    }

    public static void printCities(){
        System.out.println("Number:\t\tX\t\t\tY");
        for(City city: cities){
            System.out.println(city.getCityNumber() + "\t\t\t" + city.getCoordinateX() + "\t\t\t" + city.getCoordinateY());
        }
    }

    private static double getCoordinateX(){
        System.out.println("Enter coordinate X");
        return Tsp.scan.nextInt();
    }

    private static double getCoordinateY(){
        System.out.println("Enter coordinate Y");
        return Tsp.scan.nextInt();
    }

    public static void setCitiesAsUnvisited(){
        for(City city : cities){
            city.setVisited(false);
        }
    }
}
