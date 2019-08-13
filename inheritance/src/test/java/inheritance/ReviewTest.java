package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review testReview = new Review("Marisha", 5f, "The food was good.");

        assertEquals("The toString method should work on a new Review instance",
                "A 5.0 star review by Marisha: The food was good.",
                testReview.toString());
    }
}