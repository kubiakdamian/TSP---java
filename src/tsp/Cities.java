package tsp;

import java.util.ArrayList;
import java.util.Scanner;

public class Cities {
    public static ArrayList<City> getCities() {
        return cities;
    }

    private static ArrayList<City> cities = new ArrayList<>();


    public static void addCity(){
        int number;
        double coordinateX;
        double coordinateY;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter city number");
        number = reader.nextInt();

        System.out.println("Enter coordinate X");
        coordinateX = reader.nextInt();

        System.out.println("Enter coordinate Y");
        coordinateY = reader.nextInt();

        City city = new City(number, coordinateX, coordinateY);
        cities.add(city);
    }

    public static void printCities(){
        System.out.println("Number:\t\tX\t\t\tY");
        for(City city: cities){
            System.out.println(city.getCityNumber() + "\t\t\t" + city.getCoordinateX() + "\t\t\t" + city.getCoordinateY());
        }
    }
}
