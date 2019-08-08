# Lab 3: Maps, File I/O, and Testing (File I/O)

[Code](/linter/src/main/java/linter/App.java)

[Tests](/linter/src/test/java/linter/AppTest.java)

## Feature Tasks

### JavaScript Linter
Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

* Don’t show an error if the line is empty.
* Don’t show an error if the line ends with an opening curly brace {
* Don’t show an error if the line ends with an closing curly brace }
* Don’t show an error if the line contains if or else

Expected output for errors:
```
Line 3: Missing semicolon.
Line 5: Missing semicolon.
Line 11: Missing semicolon.
Line 13: Missing semicolon.
Line 15: Missing semicolon.
Line 26: Missing semicolon.
```
