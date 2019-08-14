package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MovieReviewTest {
    LinkedList<String> startingMovies;
    LinkedList<Business> businesses;
    Business testBusiness_Theater;
    Business testBusiness_Shop;
    Restaurant testRestaurant;
    Review savedAsNormalReview;
    Review fiveStarReview;
    Review twoStarReview;
    MovieReview savedAsMovieReview;
    MovieReview fourStarMovieReview;
    MovieReview oneStarMovieReview;



    @Before
    public void setUpStuff() {
        startingMovies = new LinkedList<>();
        startingMovies.add("You've Got Mail");
        startingMovies.add("The Secret Life of Walter Mitty");
        testBusiness_Theater = new Theater("Sadie's", startingMovies);
        testBusiness_Shop = new Shop("Lulu's", "Bagel",3);
        testRestaurant = new Restaurant("Plain Ol Pizza Place", 1);

        savedAsNormalReview = new MovieReview("Brandon", 5, "Great movie, great theater", "The Secret Life of Walter Mitty");
        savedAsMovieReview = new MovieReview("Michael", 4, "Enjoyed the movie more than I thought", "You've Got Mail");
        fiveStarReview = new Review("Person", 5, "yes yes yes");
        twoStarReview = new Review(2, "meh.");
        fourStarMovieReview = new MovieReview("Another person", 4, "darn good", "Movie Name");
        oneStarMovieReview = new MovieReview("BOO", 1, "BOOOOOOOO", "Casper");

        testBusiness_Theater.addReview(savedAsNormalReview);
        testBusiness_Theater.addReview(savedAsMovieReview);

        businesses = new LinkedList<>();
        businesses.add(testBusiness_Theater);
        businesses.add(testBusiness_Shop);
        businesses.add(testRestaurant);
    }

    @Test
    public void testToString_savedAsMovieReview() {
        assertEquals("The movie review string should include the movie name, or N/A",
                "A 4.0 star review of Sadie's showing 'You've Got Mail' by Michael: Enjoyed the movie more than I thought",
                savedAsMovieReview.toString());

    }

    @Test
    public void testToString_savedAsNormalReview() {
        assertEquals("The movie review string should include the movie name, or N/A even if saved as a normal review",
                "A 5.0 star review of Sadie's showing 'The Secret Life of Walter Mitty' by Brandon: Great movie, great theater",
                savedAsNormalReview.toString());
    }

    @Test
    public void testBusinesses() {
        testBusiness_Theater.addReview(fourStarMovieReview);
        testBusiness_Shop.addReview(fiveStarReview);
        testRestaurant.addReview(fiveStarReview);
        testRestaurant.addReview(oneStarMovieReview);
        testRestaurant.addReview(twoStarReview);
        testBusiness_Theater.addReview(oneStarMovieReview);

        for ( Business business : businesses ) {
            System.out.println(business.toString());
            System.out.println("Reviews: " + business.getReviews());
            System.out.println("\n");
        }

    }
}