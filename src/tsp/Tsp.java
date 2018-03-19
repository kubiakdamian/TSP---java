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
                    "2. To print cities.");

            chosenOption = reader.nextInt();
            switch (chosenOption){
                case 1:
                    addCity();
                    break;
                case 2:
                    printCities();
                    break;

                default:
                    break;
            }
        }
        reader.close();
    }

    private static void addCity(){
        int number;
        float coordinateX;
        float coordinateY;
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
}
