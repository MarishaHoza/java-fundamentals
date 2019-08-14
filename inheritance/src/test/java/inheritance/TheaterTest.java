package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater testTheater;
    Review fourStarReview;

    @Before
    public void setUp() throws Exception {
        testTheater = new Theater("MoviePlace", new LinkedList<String>());
        fourStarReview = new Review(4);
    }

    @Test
    public void addMovie() {
        testTheater.addMovie("Batman");
        assertEquals("Batman should be included in the movies",
                true, testTheater.movies.contains("Batman"));
    }

    @Test
    public void removeMovie() {
        testTheater.addMovie("Batman");
        testTheater.removeMovie("Batman");
        assertEquals("Batman should be removed from the movies",
                false, testTheater.movies.contains("Batman"));
    }

    @Test
    public void calcStars() {
        testTheater.addReview(fourStarReview);
        assertEquals("Stars should calc correctly",
                4.0, testTheater.calcStars(), 0.001);
    }

    @Test
    public void getName() {
        assertEquals("Name should be returned",
                "MoviePlace", testTheater.getName());
    }

    @Test
    public void addReview() {
        testTheater.addReview(fourStarReview);
        assertEquals("Reviews should be added",
                1, testTheater.reviews.size());
    }

    @Test
    public void toString1() {
        testTheater.addMovie("Batman");
        testTheater.addMovie("Megamind");
        assertEquals("theater should print to string as expected",
                "MoviePlace is a theater with 0.0 stars, 0 reviews, and a current showing list of: [Batman, Megamind]",
                testTheater.toString());
    }
}