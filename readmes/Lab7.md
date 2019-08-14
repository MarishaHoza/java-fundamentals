# Lab 07: Composition and Inheritance, Part 2
#### Restaurant: [Code](/inheritance/src/main/java/inheritance/Restaurant.java) | [Tests](/inheritance/src/test/java/inheritance/RestaurantTest.java)

#### Shop: [Code](/inheritance/src/main/java/inheritance/Shop.java) | [Tests](/inheritance/src/test/java/inheritance/ShopTest.java)

#### Theater: [Code](/inheritance/src/main/java/inheritance/Theater.java) | [Tests](/inheritance/src/test/java/inheritance/TheaterTest.java)

#### Review: [Code](/inheritance/src/main/java/inheritance/Review.java) | [Tests](/inheritance/src/test/java/inheritance/ReviewTest.java)

#### MovieReview: [Code](/inheritance/src/main/java/inheritance/MovieReview.java) | [Tests](/inheritance/src/test/java/inheritance/MovieReviewTest.java)


## Feature Tasks
#### This lab builds on features from [Lab 6](/readmes/Lab6.md).
1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.

2. The users also want to review shops!

3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

4. Review all the things!

5. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.

## Running the Code
Test that the code base works properly by navigating to the repository in your terminal and typing `./gradlew test`.

### Using the Restaurant and Review classes

#### Business Objects (any of the below can also be saved as the type `Business`)
To instantiate a new `Restaurant` object:
```
Restaurant foo = new Restaurant(String name, int priceCategory);
```

To instantiate a new `Shop` object:
```
Shop foo = new Shop(String name, String description, int priceCategory);
```

To instantiate a new `Theater` object:
```
Theater foo = new Theater(String name, LinkedList<String> movies);
```

#### Review Objects (any of the below can be saved as the type `Review`)
To instantiate a new `Review` object:
```
Review option1 = new Review(String author, float numStars, String body);
Review option2 = new Review(float numStars, String body);
Review option3 = new Review(float numStars);
```

To instantiate a new `MovieReview` object:
```
MovieReview option1 = new MovieReview(String author, float numStars, String body, String movie);
MovieReview option2 = new MovieReview(String author, float numStars, String body);
MovieReview option3 = new MovieReview(float numStars, String body);
MovieReview option4 = new MovieReview(float numStars);
```

#### Available methods:
* ##### Business
  * _.addReview(Review review)_
    Adds the given review to the list of reviews about the restaurant and updates the restaurant's star rating. Any single review can only belong to one restaurant.
  * _.calcStars()_
    Itterates through assigned reviews and calculates the average star rating for the business.
  * _.getName()_
    Returns the name of the business.
  * _.getReviews()_
    Returns a Linked List of reviews for the business.
  * _.toString()_
    Returns a string representing the business. 
    Eg. the expected output for a `Restaurant` object is:
    ```
    <name> is a restaurant with <star rating> stars, <total number of reveiws> reviews, and a price category of <price category>
    ```
* ##### Review
  * _.toString()_
    Returns a string representing the Review. 
    Eg. the expected output for a `MovieReview` object with a specified movie is:
    ```
    A <number of stars> star review of <name of associated theater || null> showing '<movie>' by <author>: <review body>
    ```
  * _.updateStars()_
    Updates the star value of the review.
