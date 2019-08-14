package inheritance;

import java.util.LinkedList;

public class Shop implements Business{
    String name;
    String description;
    int priceCategory;
    LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
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

    public String getName(){
        return this.name;
    }

    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review review){
        if ( review.linkedBusiness == null && review.getClass() != MovieReview.class ){
            review.linkedBusiness = this;
            reviews.add(review);

        } else {
            // this review has already been added to a business or is a movie review, do nothing
        }
    }

    public String toString(){
        return String.format("%s is a %s shop with %.1f stars, %d reviews, and a price category of %d", name, description, calcStars(), reviews.size(), priceCategory);
    }

}
