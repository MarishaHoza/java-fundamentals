# Lab 3: Maps, File I/O, and Testing (Maps)

[Code](/basiclibrary/src/main/java/basiclibrary/Lab3.java)

[Tests](/basiclibrary/src/test/java/basiclibrary/Lab3Test.java)

## Feature Tasks

### Analyzing Weather Data
Use October Seattle weather data (nested array). Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

Expected output:
```
High: 72
Low: 51
Never saw temperature: 63
Never saw temperature: 67
Never saw temperature: 68
Never saw temperature: 69
```

### Tallying Election
Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

Expected output:
```
"____ received the most votes!"
```