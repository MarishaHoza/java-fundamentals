package inheritance;

public class Review {
    // Each Review should have a body, an author, and a number of stars.
    String author;
    float numStars;
    String body;

    public Review(String author, float numStars, String body){
        this.author = author;
        this.numStars = numStars;
        this.body = body;
    }

    public String toString(){
        return String.format("A %.1f star review by %s: %s", numStars, author, body);
    }

}
