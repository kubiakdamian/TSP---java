package tsp;

import java.util.ArrayList;
import java.util.Scanner;

public class Tsp {
    private static ArrayList<City> cities;

    public static void main(String[] args){
        int chosenOption = 100;
        Scanner reader = new Scanner(System.in);
        cities = new ArrayList<>();

        while(chosenOption != 0){
            System.out.println("Press\n" +
                    "0. To Exit.\n" +
                    "1. To add city.\n" +
                    "2. To print cities.\n" +
                    "3. Calculate distance between 2 cities.\n");

            chosenOption = reader.nextInt();
            switch (chosenOption){
                case 1:
                    addCity();
                    break;
                case 2:
                    printCities();
                    break;
                case 3:
                    System.out.println(calculateDistance(cities.get(0), cities.get(1)));
                    break;

                default:
                    break;
            }
        }
        reader.close();
    }

    private static void addCity(){
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

    private static void printCities(){
        System.out.println("Number:\t\tX\t\t\tY");
        for(City city: cities){
            System.out.println(city.getCityNumber() + "\t\t\t" + city.getCoordinateX() + "\t\t\t" + city.getCoordinateY());
        }
    }

    private static double calculateDistance(City firstCity, City secondCity){
        double result = 0;

        result = (secondCity.getCoordinateX() - firstCity.getCoordinateX()) * (secondCity.getCoordinateX() - firstCity.getCoordinateX());
        result += (secondCity.getCoordinateY() - firstCity.getCoordinateY()) * (secondCity.getCoordinateY() - firstCity.getCoordinateY());
        result = Math.sqrt(result);

        return result;
    }
}
