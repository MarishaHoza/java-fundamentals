package inheritance;

public class Review {
    // Each Review should have a body, an author, and a number of stars.
    String author;
    float numStars;
    String body;
    String linkedRestaurant = null;

    public Review(String author, float numStars, String body){
        this.author = author;
        this.numStars = numStars;
        this.body = body;
    }

    public Review(float numStars, String body){
        this("Anonymous", numStars, body);
    }

    public Review(float numStars){
        this("Anonymous", numStars, "");
    }

    public String toString(){
        return String.format("A %.1f star review of %s by %s: %s", numStars, linkedRestaurant, author, body);
    }

}
