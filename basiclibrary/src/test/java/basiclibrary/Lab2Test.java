package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {

    // ********** Test the Roll Dice algorithm **********
    @Test
    public void roll() {
        assertTrue("The new array should have a length of n",
                Lab2.roll(5).length == 5);
    }

    @Test
    public void roll_checkValidNums(){
        assertTrue("The new array should not contain values < 1 or > 6",
                testValuesBetween(Lab2.roll(50), 1, 6));
    }

    // helper function for checkValidNums
    public static boolean testValuesBetween(int[] arr, int min, int max){
        for ( int i = 0; i < arr.length; i++ ){
            if ( arr[i] < min || arr[i] > max ){
                return false;
            }
        }
        return true;
    }


    // ********** Test the Duplicates algorithm **********
    @Test
    public void containsDuplicates() {
        assertTrue("An array with duplicates should return true",
                Lab2.containsDuplicates(new String[]{"Cats", "Fish", "Turtles", "Cats"}));
    }

    @Test
    public void containsDuplicates_false(){
        assertFalse("An array with no duplicates should return false",
                Lab2.containsDuplicates(new String[]{"Cats, Fish, Turtles, Beavers"}));
    }


    // ********** Test the Average algorithm **********
    @Test
    public void calculateAverage() {
        assertTrue("The function should return the average",
                8 == Lab2.calculateAverage(new int[]{2, 14, 7, 9}));
    }


    // ********** Test the Nested Arrays algorithm **********
    @Test
    public void calculateAllAverages() {
        assertArrayEquals("The nested arrays should reduce to averages",
                new int[]{2,6,8}, Lab2.calculateAllAverages(new int[][]{{4,2,1,1},{12,8,4,0},{9,7,10,6}}));
        assertTrue("The final array should have the same outer length as the original",
                Lab2.calculateAllAverages(new int[][]{
                        {66, 64, 58, 65, 71, 57, 60},
                        {57, 65, 65, 70, 72, 65, 51},
                        {55, 54, 60, 53, 59, 57, 61},
                        {65, 56, 55, 52, 55, 62, 57}
                }).length == 4);
    }
}