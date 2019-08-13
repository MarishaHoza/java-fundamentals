package inheritance;

import java.util.LinkedList;

public class Restaurant {
    //  Each Restaurant should have a name, a number of stars between 0 and 5, and a price category (i.e. number of dollar signs).
    String name;
    float numStars = 0.0f;
    String priceCategory;
    LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, String priceCategory){
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public void addReview(Review review){
        if ( review.linkedRestaurant == null ){
            review.linkedRestaurant = this.name;
            reviews.add(review);

            float prevTotalStars = (this.numStars * (reviews.size() - 1));
            float newTotalStars = prevTotalStars + review.numStars;
            float newAvgStars = newTotalStars / reviews.size();
            this.numStars = newAvgStars;

        } else {
            // this review has already been added to a restaurant
        }

    }

    public String toString(){
        return String.format("%s is a restaurant with %.1f stars, %d reviews, and a price category of %s", name, numStars, reviews.size(), priceCategory);
    }


}
