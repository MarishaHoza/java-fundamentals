package inheritance;

public class Restaurant {
    //  Each Restaurant should have a name, a number of stars between 0 and 5, and a price category (i.e. number of dollar signs).
    String name;
    float numStars;
    String priceCategory;

    public Restaurant(String name, float numStars, String priceCategory){
        this.name = name;
        this.numStars = numStars;
        this.priceCategory = priceCategory;
    }

    public String toString(){
        return String.format("%s is a restaurant with %.1f stars and a price category of %s", name, numStars, priceCategory);
    }
}
