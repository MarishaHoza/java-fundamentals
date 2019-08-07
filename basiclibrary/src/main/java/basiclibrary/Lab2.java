package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab2 {

    // Rolling Dice
    public static int[] roll(int n){
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++){
            int roll = (int)(Math.floor(Math.random() * 6) + 1);
            rolls[i] = roll;
        }

        return rolls;
    }

    // Contains Duplicates
    public static boolean containsDuplicates(String[] arr){
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for( int i = 0; i < arr.length; i++){
            // indexOf and lastIndexOf from https://www.geeksforgeeks.org/java-util-arraylist-indexof-java/
            if (list.indexOf(arr[i]) != list.lastIndexOf(arr[i])){
                return true;
            }
        }
        return false;
    }


    // Calculating Averages
    public static double calculateAverage(int[] arr){
        int total = 0;
        for ( int i = 0; i < arr.length; i++ ){
            total += arr[i];
        }
        double average = (double)total / (double) arr.length;
        return average;
    }


    // Arrays of Arrays
    public static int[] calculateAllAverages(int[][] arrs){
        int[] bestSoFar = arrs[0];
        for ( int[] currentArray : arrs ){
            if(calculateAverage(currentArray) < calculateAverage(bestSoFar)){
                bestSoFar = currentArray;
            }
        }
        return bestSoFar;
//        int[] averages = new int[arrs.length];
//        for ( int i = 0; i < arrs.length; i++ ){
//            averages[i] = calculateAverage(arrs[i]);
//        }
//        return averages;
    }
}
