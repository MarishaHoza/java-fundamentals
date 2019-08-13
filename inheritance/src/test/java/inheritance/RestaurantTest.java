package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("Vince's Coffee", 5f, "$$");

        System.out.println(testRestaurant.toString());
        assertEquals("The string method should work on a Restaurant instance",
                "Vince's Coffee is a restaurant with 5.0 stars and a price category of $$",
                testRestaurant.toString());
    }
}