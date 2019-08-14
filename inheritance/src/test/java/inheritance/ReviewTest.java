package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review testReview = new Review("Marisha", 5f, "The food was good.");
        testReview.linkedBusiness = new Restaurant("Vince's Coffee", 2);

        assertEquals("The toString method should work on a new Review instance",
                "A 5.0 star review of Vince's Coffee by Marisha: The food was good.",
                testReview.toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNewReview_sixStarReview(){
        Review sixStarReview = new Review("Hacker", 6f, "MUHUHAHAHA");
    }
}