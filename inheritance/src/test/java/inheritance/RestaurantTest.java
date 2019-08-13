package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant coffeeHut;
    Restaurant diner;
    Review twoStarReview;
    Review threeStarReview;
    Review fiveStarReview;

    @Before
    public void makeTestObjects() {
        coffeeHut = new Restaurant("Vince's Coffee", "$$");
        diner = new Restaurant("Lindy's Diner", "$");
        twoStarReview = new Review(2f);
        threeStarReview = new Review(3f, "Average everything");
        fiveStarReview = new Review("Melody", 5f, "Outstanding!!!");
    }

    @Test
    public void testToString() {
        assertEquals("The string method should work on a Restaurant instance",
                "Vince's Coffee is a restaurant with 0.0 stars, 0 reviews, and a price category of $$",
                coffeeHut.toString());
    }

    @Test
    public void testAddReview() {
        diner.addReview(threeStarReview);
        assertEquals( "The new star rating should reflect the restaurant's only review",
                3.0f, diner.calcStars(), 0.0001);
    }

    @Test
    public void testAddReview_several() {
        coffeeHut.addReview(twoStarReview);
        coffeeHut.addReview(threeStarReview);
        coffeeHut.addReview(fiveStarReview);

        assertEquals("the number of reviews on the coffee hut should match the number of reviews added",
                3, coffeeHut.reviews.size());
    }

    @Test
    public void testAddReview_sameReview() {
        diner.addReview(threeStarReview);
        diner.addReview(fiveStarReview);
        diner.addReview(threeStarReview);

        assertEquals("The number of stars should not change if a review has already been added",
                4f, diner.calcStars(), 0.001);
    }

    @Test
    public void testAddReview_twoRestaurants() {
        diner.addReview(threeStarReview);

        coffeeHut.addReview(twoStarReview);
        coffeeHut.addReview(threeStarReview);
        coffeeHut.addReview(fiveStarReview);

        assertEquals("A review should not be able to be added to more than one restaurant",
                2, coffeeHut.reviews.size());
    }


//    @Test
//    public void testReviews() {
//        Restaurant testRestaurant = new Restaurant("Lindy's Diner", "$");
//        Review exampleReview = new Review("Marisha", 4f, "The staff was really nice");
//        Review exampleReview2 = new Review("Keith", 4.5f, "Best coffee in the area!");
//        System.out.println("Original number of stars: " + testRestaurant.numStars);
//        testRestaurant.addReview(exampleReview);
//        System.out.println("New number of stars: " + testRestaurant.numStars);
//        testRestaurant.addReview(exampleReview2);
//        System.out.println("New number of stars: " + testRestaurant.numStars);
//        testRestaurant.addReview(exampleReview);
//        System.out.println("Same number of stars?: " + testRestaurant.numStars);
//
//        System.out.println(testRestaurant.reviews.toString());
//    }
}