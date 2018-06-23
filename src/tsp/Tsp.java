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
                    "4. Calculate whole distance with shortest path\n" +
                    "5. Calculate whole distance with brute force");

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
                    shortestPathCalculation();
                    break;
                case 5:
                    bruteForceCalculation();
                default:
                    break;
            }
        }

        scan.close();
    }

    private static int getCityNumber(){
        System.out.println("Enter city number");
        return scan.nextInt();
    }

    private static void shortestPathCalculation(){
        int chosenCity;
        long startTime;

        chosenCity = getCityNumber();
        startTime = System.currentTimeMillis();
        System.out.println(ShortestPath.findShortestPath(chosenCity));
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Shortest path duration: " + (double)(time / 1000) + "s");
    }

    private static void bruteForceCalculation(){
        int chosenCity;
        long startTime;

        chosenCity = getCityNumber();
        startTime = System.currentTimeMillis();
        System.out.println(BruteForce.findShortestPath(Cities.getArrayWithCitiesNumbers(), chosenCity));
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Brute force duration: " + (double)(time / 1000) + "s");
    }
}
