# BookStore Management System

This is a Java application for managing a bookstore. It includes classes for storing information about novels and a bookstore, as well as methods for performing various operations on the data.

## Features

- **Novel Class**: Represents a novel with properties such as title, author name, and year published.
- **BookStore Class**: Represents a bookstore with a name and a list of novels. It includes methods for printing all titles, printing titles containing a specified substring, printing titles of a certain length, printing author names that start or end with a specified substring, and getting the longest title or author name.
- **Main Class**: Contains the main method to run the application. It creates a BookStore object, populates it with novels, and demonstrates the functionality of the BookStore class methods.

## How to Use

1. **Compile**: Compile the Java files using a Java compiler.
   ```
   javac BookStore.java Novel.java
   ```

2. **Run**: Run the Main class with command-line arguments specifying the name of the bookstore.
   ```
   java Main "MyBookstore"
   ```

3. **Output**: The application will print various information about the novels in the bookstore based on the implemented methods.

## Methods

- `printAllTitles()`: Prints all titles in uppercase.
- `printTitlesContaining(String substring, boolean caseSensitive)`: Prints titles containing the specified substring, with an option for case sensitivity.
- `printTitlesOfLength(int length)`: Prints titles of the specified length.
- `printNameStartsEndsWith(String substring)`: Prints author names that start or end with the specified substring.
- `getLongest(String property)`: Returns the longest title or author name based on the specified property.

## Sample Output

Sample output demonstrating the usage of various methods in the BookStore class.

## Example

```java
public class Main {
    public static void main(String[] args) {
        BookStore b = new BookStore(args[0]);
        b.printAllTitles();
        b.printTitlesContaining("the", false);
        b.printTitlesContaining("the", true);
        b.printTitlesOfLength(13);
        b.printNameStartsEndsWith("aN");
        System.out.println(b.getLongest("xyz"));
        System.out.println(b.getLongest("AutHor"));
        System.out.println(b.getLongest("titlE"));
    }
}
```

