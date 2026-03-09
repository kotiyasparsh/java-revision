package intermideate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Class to represent a coding book with its details
class  CodingBooks{
    double price;           // Price of the book
    String name;            // Title of the book
    int publicationYear;    // Year when the book was published
    String subject;         // Topic/Subject of the book

    // Constructor to create a CodingBooks object with all details
    public CodingBooks(String name, double price, int publicationYear, String subject){
        this.name = name;
        this.price = price;
        this.publicationYear = publicationYear;
        this.subject = subject;
    }

    // Override toString() to display book information in a readable format
    // This method is called automatically when you print a CodingBooks object
    @Override
    public String toString() {
        return "CodingBooks{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", subject='" + subject + '\'' +
                '}';
    }

}
public class BookStoreChallenge {
    public static void main(String[] args) {

         /*
        BOOKSTORE CHALLENGE - Learn Streams with Real-World Scenarios:

        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */

        // Create a list of CodingBooks objects with sample data
        // This list contains 10 different programming books with their details
        List<CodingBooks> codingBooks = Arrays.asList(

                new CodingBooks("Clean Code", 42.50, 2008, "Software Engineering"),
                new CodingBooks("Effective Java", 55.00, 2017, "Java Programming"),
                new CodingBooks("Head First Java", 35.75, 2005, "Java Programming"),
                new CodingBooks("The Pragmatic Programmer", 48.90, 1999, "Software Development"),
                new CodingBooks("Design Patterns", 50.25, 1994, "Software Architecture"),
                new CodingBooks("Introduction to Algorithms", 65.00, 2009, "Algorithms"),
                new CodingBooks("Cracking the Coding Interview", 40.00, 2015, "Interview Preparation"),
                new CodingBooks("Java Concurrency in Practice", 47.80, 2006, "Concurrency"),
                new CodingBooks("Spring in Action", 44.60, 2018, "Spring Framework"),
                new CodingBooks("Refactoring", 49.99, 2018, "Code Quality")

        );

        // ===== STREAM BASICS - For Beginners =====
        // This shows the traditional verbose way to use streams (educational purposes)
        // Step 1: Create a stream from the list
        // Step 2: Filter the stream (keep only books with price < 50)
        // Step 3: Print each filtered book

        // Stream<CodingBooks> CheapBooks = codingBooks.stream();
        // Stream<CodingBooks> CheapBooks2 = CheapBooks.filter(predicate);
        // CheapBooks2.forEach(System.out::println);


        // ===== CHALLENGE 1: DISCOUNTED BOOKS (Price over $20) =====
        // Scenario: Bookstore wants to display all books priced over $34 for their sale
        System.out.println(" priced over $20. Display these books");

        // .stream() - Convert the List into a Stream (a pipeline for data processing)
        // .filter() - Keep only books where price > 34 (remove books that don't meet criteria)
        // .forEach() - Execute System.out::println for each remaining book (print each one)
        codingBooks.stream()
                .filter(CodingBooks -> CodingBooks.price > 34)
                .forEach(System.out::println);



        // ===== CHALLENGE 2: CLASSICS COLLECTION (Published before 2000) =====
        // Scenario: Find all classic programming books published before the year 2000
        System.out.println("\nbooks that were published before the year 2000.");

        // .stream() - Create a stream from the list
        // .filter() - Keep only books published before year 2000
        // .forEach() - Print each classic book
        codingBooks.stream()
                .filter(CodingBooks -> CodingBooks.publicationYear < 2000)
                .forEach(System.out::println);



        // ===== CHALLENGE 3: UPCOMING TITLES (Add "Coming Soon" suffix) =====
        // Scenario: Create marketing text for next year's titles
        System.out.println("\nUpcoming Titles for Next Year:");

        // .stream() - Create a stream from the list
        // .map() - Transform each book into a new string with "(Coming Soon)" appended
        //         Note: map() changes the data type from CodingBooks to String
        //         We only need the book's name, so we use CodingBooks.name
        // .forEach() - Print each transformed title
        codingBooks.stream()
                .map(CodingBooks -> CodingBooks.name + " (Coming Soon)")
                .forEach(System.out::println);



        // ===== CHALLENGE 4: SORT BY PRICE (Price Tags) =====
        // Scenario: Print books in order from cheapest to most expensive for price tags
        System.out.println("\nBooks Sorted by Price (Ascending):");

        // .stream() - Create a stream from the list
        // .sorted() - Arrange books in order. Comparator.comparingDouble() compares prices
        // .forEach() - Print each sorted book
        codingBooks.stream()
                .sorted(Comparator.comparingDouble(CodingBooks -> CodingBooks.price))
                .forEach(System.out::println);


        // ===== CHALLENGE 5: RARE BOOKS (Title length > 20 characters) =====
        // Scenario: Find books with particularly long titles (rare editions)
        System.out.println("\nRare Books (Titles with more than 20 characters):");

        // .stream() - Create a stream from the list
        // .filter() - Keep only books where the title (name) has more than 20 characters
        //            name.length() returns the number of characters in the title
        // .forEach() - Print each rare book
        codingBooks.stream()
                .filter(CodingBooks -> CodingBooks.name.length() > 20)
                .forEach(System.out::println);
    }







    // ===== HELPER: PREDICATE DEFINITION (Alternative way to filter) =====
    // A Predicate is a functional interface that returns true or false
    // This is used as an alternative to lambda expressions for filtering
    // Example: Instead of .filter(book -> book.price < 50)
    //          You can use .filter(predicate) where predicate is defined below
    // This predicate checks if a book's price is less than 50
    static Predicate<CodingBooks> predicate = new Predicate<CodingBooks>() {
        @Override
        public boolean test(CodingBooks codingBooks) {
            return codingBooks.price < 50;  // Returns true if price is less than 50
        }
    };

}
