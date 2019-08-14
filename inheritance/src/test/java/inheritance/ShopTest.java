package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;
    Review oneStarReview;
    Review fiveStarReview;

    @Before
    public void setUpTestShop() {
        testShop = new Shop("PetCo", "Pet Supplies", 2);
        oneStarReview = new Review("Person 1", 1, "Everything was terrible");
        fiveStarReview = new Review("Person 2", 5, "Everything was outstandingly wonderful");
    }

    @Test
    public void calcStars() {
        testShop.addReview(oneStarReview);
        testShop.addReview(fiveStarReview);
        assertEquals("The star value should calculate based on all reviews",
                3.0f, testShop.calcStars(), 0.0001);
    }

    @Test
    public void getName() {
        assertEquals("The getName method should return the shop name",
                "PetCo", testShop.getName());
    }

    @Test
    public void addReview() {
        testShop.addReview(oneStarReview);
        testShop.addReview(fiveStarReview);
        testShop.addReview(fiveStarReview);
        assertEquals("New reviews should be added to the reviews list",
                2, testShop.reviews.size());
    }

    @Test
    public void toString1() {
        assertEquals("The toString method should return as expected",
                "PetCo is a Pet Supplies shop with 0.0 stars, 0 reviews, and a price category of 2",
                testShop.toString());
    }
}