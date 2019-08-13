package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
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

        } else {
            // this review has already been added to a restaurant, do nothing
        }
    }

    public float calcStars(){
        float stars = 0.0f;

        if (reviews.size() > 0) {
            for (int i = 0; i < reviews.size(); i++) {
                stars += reviews.get(i).numStars;
            }
            stars = stars / reviews.size();
        }

        return stars;
    }

    public String toString(){
        return String.format("%s is a restaurant with %.1f stars, %d reviews, and a price category of %s", name, calcStars(), reviews.size(), priceCategory);
    }


}
