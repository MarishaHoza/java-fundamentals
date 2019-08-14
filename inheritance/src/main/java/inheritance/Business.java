package inheritance;

import java.util.LinkedList;

public interface Business {
    void addReview(Review review);
    float calcStars();
    String getName();
    LinkedList<Review> getReviews();
}
