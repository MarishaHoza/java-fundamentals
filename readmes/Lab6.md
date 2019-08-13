## Lab 06: Inheritance and Interfaces
#### Restaurant: [Code](/inheritance/src/main/java/inheritance/Restaurant.java) | [Tests](/inheritance/src/test/java/inheritance/RestaurantTest.java)
#### Review: [Code](/inheritance/src/main/java/inheritance/Review.java) | [Tests](/inheritance/src/test/java/inheritance/ReviewTest.java)

## Feature Tasks
1. Create a class to represent a __Restaurant__. Each Restaurant should have a __name__, a __number of stars__ betweeen 0 and 5, and a __price category__ (i.e. number of dollar signs).

2. Create a class to represent a __Review__. Each Review should have a __body__, an __author__, and a __number of stars__.

3. A Review should be about a single Restaurant. Choose an implementation for this, and implement it.

4. Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.

5. When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)


