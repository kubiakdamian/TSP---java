package tsp;

import java.util.Scanner;

public class Tsp {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int chosenOption = 100;

        while(chosenOption != 0){
            System.out.println("Press\n" +
                    "0. To Exit.\n" +
                    "1. To add city.\n" +
                    "2. To print cities.\n" +
                    "3. Calculate distance between 2 cities.\n" +
                    "4. Calculate whole distance with shortest path\n");

            chosenOption = scan.nextInt();
            switch (chosenOption){
                case 1:
                    Cities.addCity();
                    break;
                case 2:
                    Cities.printCities();
                    break;
                case 3:
                    System.out.println(Distance.calculateDistance());
                    break;
                case 4:
                    System.out.println(ShortestPath.findShortestPath(0));
                default:
                    break;
            }
        }

        scan.close();
    }
}
