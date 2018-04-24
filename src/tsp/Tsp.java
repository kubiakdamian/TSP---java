package tsp;

import java.util.Scanner;

public class Tsp {

    public static void main(String[] args){
        int chosenOption = 100;
        Scanner reader = new Scanner(System.in);

        while(chosenOption != 0){
            System.out.println("Press\n" +
                    "0. To Exit.\n" +
                    "1. To add city.\n" +
                    "2. To print cities.\n" +
                    "3. Calculate distance between 2 cities.\n");

            chosenOption = reader.nextInt();
            switch (chosenOption){
                case 1:
                    Cities.addCity();
                    break;
                case 2:
                    Cities.printCities();
                    break;
                case 3:
                    System.out.println(Distance.calculateDistance(Cities.getCities().get(0), Cities.getCities().get(1)));
                    break;
                default:
                    break;
            }
        }
        reader.close();
    }
}
