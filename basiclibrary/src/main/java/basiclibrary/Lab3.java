package basiclibrary;

import java.util.*;

public class Lab3 {

    // Map Temperatures
    public static String MapTemperatures(int[][] weeklyMonthTemperatures){

        // error check for empty input
        if (weeklyMonthTemperatures.length == 0 || weeklyMonthTemperatures[0].length == 0){
            return "No temperatures given";
        }

        // placeholders for highest and lowest temp so far
        int lowest = weeklyMonthTemperatures[0][0];
        int highest = weeklyMonthTemperatures[0][0];

        // create hash set
        HashSet<Integer> temperatures = new HashSet<>();

        // fill hash set and update highest and lowest
        for ( int i = 0; i < weeklyMonthTemperatures.length; i++ ){
            for ( int j = 0; j < weeklyMonthTemperatures[i].length; j++ ){
                temperatures.add(weeklyMonthTemperatures[i][j]);

                if ( weeklyMonthTemperatures[i][j] < lowest ){
                    lowest = weeklyMonthTemperatures[i][j];
                }
                if ( weeklyMonthTemperatures[i][j] > highest ){
                    highest = weeklyMonthTemperatures[i][j];
                }
            }
        }

        // create string to return
        String returnString = String.format("High: %d %nLow: %d", highest, lowest);

        // check for temperatures not seen and add them to the return string
        for ( int i = lowest; i < highest; i++){
            if ( !temperatures.contains(i) ) {
                returnString += String.format("%nNever saw temperature: %d", i);
            }
        }

        // return
        return returnString;
    }


    // Tally Votes
    public static String TallyVotes(List<String> votes){
        String winner = "___";
        int winnerVotes = 0;

        HashMap<String, Integer> candidates = new HashMap<>();

        // tally votes and add to HashMap
        for (String vote : votes ) {
            if ( candidates.containsKey(vote) ){
                int temp = candidates.get(vote);
                temp++;
                // update a value in a hashmap
                // https://thispointer.com/java-how-to-update-the-value-of-an-existing-key-in-hashmap-put-vs-replace/
                candidates.replace(vote, temp);
            } else {
                candidates.put(vote, 1);
            }
        }

        // iterate through candidates and find highest number of votes so far, assign to winner variables
        // iterate through a hashmap
        // https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
        for (Map.Entry<String, Integer> tally : candidates.entrySet()){
            String candidate = tally.getKey();
            int numVotes = tally.getValue();

            if ( numVotes > winnerVotes ) {
                winnerVotes = numVotes;
                winner = candidate;
            } else if ( numVotes == winnerVotes ) {
                winner += String.format(" and %s", candidate);
            }
        }

//        System.out.println(String.format("%s received the most votes!", winner));

        return String.format("%s received the most votes!", winner);
    }

}
