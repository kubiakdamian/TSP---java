package tsp;

public class BruteForce {
    private static double distance;
    private static double result;

    public static double findShortestPath(int[] arr, int startingElement){
        result = Double.MAX_VALUE;
        return permuteHelper(arr, startingElement, 0);
    }

    private static double permuteHelper(int[] arr, int startingElement, int index){
        distance = 0;
        if(index >= arr.length - 1){
            for(int i = 0; i < arr.length - 1; i++){
                distance += Distance.makeCalculations(Cities.getCities().get(arr[i]), Cities.getCities().get(arr[i + 1]));
            }
            if(distance < result){
                result = distance;
            }
        }

        for(int i = index; i < arr.length; i++){
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            if(arr[0] == startingElement){
                permuteHelper(arr, startingElement, index+1);
            }

            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }

        return result;
    }
}
