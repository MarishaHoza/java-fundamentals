package inheritance;

public class MovieReview extends Review {
    String movie;

    public MovieReview(String author, float numStars, String body, String movie) {
        super(author, numStars, body);
        this.movie = movie;
    }

    public MovieReview(String author, float numStars, String body) {
        super(author, numStars, body);
        this.movie = "N/A";
    }

    public MovieReview(float numStars, String body) {
        super(numStars, body);
        this.movie = "N/A";
    }

    public MovieReview(float numStars) {
        super(numStars);
        this.movie = "N/A";
    }

    @Override
    public String toString(){
        return String.format("A %.1f star review of %s showing '%s' by %s: %s", numStars, linkedBusiness.getName(), movie, author, body);
    }

}
