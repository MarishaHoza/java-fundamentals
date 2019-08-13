package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("Vince's Coffee", "$$");

        assertEquals("The string method should work on a Restaurant instance",
                "Vince's Coffee is a restaurant with 0.0 stars, 0 reviews, and a price category of $$",
                testRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant testRestaurant = new Restaurant("Lindy's Diner", "$");
        Review exampleReview = new Review("Marisha", 4f, "The staff was really nice");
        testRestaurant.addReview(exampleReview);

        // The new star rating should reflect the restaurant's only review
        assertEquals( 4.0f, testRestaurant.numStars, 0.0001);
    }

    @Test
    public void testReviews() {
        Restaurant testRestaurant = new Restaurant("Lindy's Diner", "$");
        Review exampleReview = new Review("Marisha", 4f, "The staff was really nice");
        Review exampleReview2 = new Review("Keith", 4.5f, "Best coffee in the area!");
        System.out.println("Original number of stars: " + testRestaurant.numStars);
        testRestaurant.addReview(exampleReview);
        System.out.println("New number of stars: " + testRestaurant.numStars);
        testRestaurant.addReview(exampleReview2);
        System.out.println("New number of stars: " + testRestaurant.numStars);
        testRestaurant.addReview(exampleReview);
        System.out.println("Same number of stars?: " + testRestaurant.numStars);

        System.out.println(testRestaurant.reviews.toString());
    }
}