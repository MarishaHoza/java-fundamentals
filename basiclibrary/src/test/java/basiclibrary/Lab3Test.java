package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Lab3Test {

    // ********************* Test Map Temperatures ***********************

    // Daily average temperatures for Seattle, October 1-28 2017
    int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    @Test
    public void MapTemperatures_notNull() {
        assertNotNull("The return string shouldn't be empty if given values",
                Lab3.MapTemperatures(weeklyMonthTemperatures));
    }

    @Test
    public void MapTemperatures_containsLowestAndHighest() {
        assertTrue("The return string should contain the lowest and highest numbers",
                Lab3.MapTemperatures(weeklyMonthTemperatures).contains("72") &&
                Lab3.MapTemperatures(weeklyMonthTemperatures).contains("51"));
    }

    @Test
    public void MapTemperatures_nullArray() {
        assertTrue("The return string should have a catch message if given empty input",
                Lab3.MapTemperatures(new int[][]{}).equals("No temperatures given"));
    }




    // ************* Test Tally Votes ****************


    @Test
    public void TallyVotes_checkWinner() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertTrue("The return string should contain the winner",
                Lab3.TallyVotes(votes).contains("Bush"));
    }

    @Test
    public void TallyVotes_checkEmpty() {
        List<String> votes = new ArrayList<>();

        assertNotNull("The tally function should not break if given an empty list",
                Lab3.TallyVotes(votes));
    }

    @Test
    public void TallyVotes_checkTie() {
        List<String> votes = new ArrayList<>();
        votes.add("Cats");
        votes.add("Cats");
        votes.add("Dogs");
        votes.add("Dogs");
        votes.add("Fish");
        votes.add("Birds");
        votes.add("Cats");
        votes.add("Dogs");

        assertTrue("The return string should include at least one 'and' to indicate a tie",
                Lab3.TallyVotes(votes).contains("and"));
    }


}