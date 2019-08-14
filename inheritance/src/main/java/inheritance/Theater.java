package inheritance;

import java.util.LinkedList;

public class Theater implements Business {
    String name;
    LinkedList<String> movies = new LinkedList<>();
    LinkedList<Review> reviews = new LinkedList<>();

    public Theater(String name, LinkedList<String> movies){
        this.name = name;
        this.movies = movies;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        movies.remove(movie);
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
        if ( review.linkedBusiness == null ){
            review.linkedBusiness = this;
            reviews.add(review);
        } else {
            // this review has already been added to a business, do nothing
        }
    }

    public String toString(){
        return String.format("%s is a theater with %.1f stars, %d reviews, and a current showing list of: %s", name, calcStars(), reviews.size(), movies);
    }
}
