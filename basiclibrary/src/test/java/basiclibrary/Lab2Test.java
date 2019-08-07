package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {
    public static boolean testValuesBetween(int[] arr, int min, int max){
        for ( int i = 0; i < arr.length; i++ ){
            if ( arr[i] < min || arr[i] > max ){
                return false;
            }
        }
        return true;
    }

    @Test
    public void roll() {
        assertTrue("The new array should have a length of n",
                Lab2.roll(5).length == 5);
        assertTrue("The new array should not contain values < 1 or > 6",
                testValuesBetween(Lab2.roll(50), 1, 6));
    }

    @Test
    public void containsDuplicates() {
        assertTrue("An array with duplicates should return true",
                Lab2.containsDuplicates(new String[]{"Cats", "Fish", "Turtles", "Cats"}));
        assertFalse("An array with no duplicates should return false",
                Lab2.containsDuplicates(new String[]{"Cats, Fish, Turtles, Beavers"}));
    }

    @Test
    public void calculateAverage() {
        assertTrue("The function should return the average",
                8 == Lab2.calculateAverage(new int[]{2, 14, 7, 9}));
    }

    @Test
    public void calculateAllAverages() {
        assertArrayEquals("The nested arrays should reduce to averages",
                new int[]{2,6,8}, Lab2.calculateAllAverages(new int[][]{{4,2,1,1},{12,8,4,0},{9,7,10,6}}));
    }
}