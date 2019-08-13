# Lab 06: Inheritance and Interfaces
#### Restaurant: [Code](/inheritance/src/main/java/inheritance/Restaurant.java) | [Tests](/inheritance/src/test/java/inheritance/RestaurantTest.java)
#### Review: [Code](/inheritance/src/main/java/inheritance/Review.java) | [Tests](/inheritance/src/test/java/inheritance/ReviewTest.java)

## Feature Tasks
1. Create a class to represent a __Restaurant__. Each Restaurant should have a __name__, a __number of stars__ betweeen 0 and 5, and a __price category__ (i.e. number of dollar signs).

2. Create a class to represent a __Review__. Each Review should have a __body__, an __author__, and a __number of stars__.

3. A Review should be about a __single__ Restaurant. Choose an implementation for this, and implement it.

4. Add an instance method __addReview__ to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.

5. When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

## Running the Code
Test that the code base works properly by navigating to the repository in your terminal and typing `./gradlew test`.

### Using the Restaurant and Review classes
To instantiate a new Restaurant object:
```
Restaurant foo = new Restaurant(String name, String priceCategory);
```
To instantiate a new Review object:
```
Review option1 = new Review(String author, float numStars, String body);
Review option2 = new Review(float numStars, String body);
Review option3 = new Review(float numStars);
```
#### Available methods:
* ##### Restaurant
  * _.addReview(Review review)_
    Adds the given review to the list of reviews about the restaurant and updates the restaurant's star rating. Any single review can only belong to one restaurant.
  * _.toString()_
    Returns a string representing the restaurant. Expected output:
    ```
    <name> is a restaurant with <star rating> stars, <total number of reveiws> reviews, and a price category of <price category>
    ```
* ##### Review
  * _.toString()_
    Returns a string representing the Review. Expected output:
    ```
    A <number of stars> star review of <name of associated restaurant || null> by <author>: <review body>
    ```
