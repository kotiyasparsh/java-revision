package intermideate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class intermediateDemo {
    public static void main(String[] args) {


        List<Book> books = Arrays.asList(
                // Logic: Title, Publication Year, Price, Category
                new Book("The Great Gatsby", 1925, 15.99, "Classic Fiction"),
                new Book("Clean Code", 2008, 42.50, "Technology"),
                new Book("The Hobbit", 1937, 12.00, "Fantasy"),
                new Book("Atomic Habits", 2018, 18.25, "Self-Help"),
                new Book("Dune", 1965, 22.99, "Science Fiction"),
                new Book("The Silent Patient", 2019, 14.50, "Thriller"),
                new Book("A Brief History of Time", 1988, 19.95, "Science"),
                new Book("The Catcher in the Rye", 1951, 11.20, "Classic Fiction"),
                new Book("Effective Java", 2017, 55.00, "Technology"),
                new Book("The Alchemist", 1988, 16.75, "Adventure")
        );
        System.out.println("Filtering: book cheaper than $20");
//    1. Filtering: book cheaper than $20
        Stream<Book> steam1 = books.stream();
        Stream<Book> steam2 = steam1.filter(predicate);
//        System.out.println(steam2.toList());
        steam2.forEach(System.out::println);

        System.out.println("apping: Convert book titles to uppercase");

//     2. Mapping: Convert book titles to uppercase
        Stream<String> upperCaseTitles = books.stream()
         .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

        System.out.println("Sorting: Books by publication date");

//      3.Sorting: Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);

        System.out.println("remove duplicate");

//        4. Distinct: remove duplicate
        Stream<Book> uniqueBooks = books.stream();
                Stream<Book> uniqueBooks2 = uniqueBooks.distinct();
                uniqueBooks2.forEach(System.out::println);


//         5. Limit: Display only the first 3 books

        System.out.println("Limit: Display only the first 3 books");

        Stream<Book> firstThreeBooks = books.stream();
        Stream<Book> firstThreeBooks2 = firstThreeBooks.limit(3);
        firstThreeBooks2.forEach(System.out::println);

//        6. Skip: Skip the first 3 books

        System.out.println("Skip: Skip the first 3 books");

        Stream<Book> skipThreeBooks = books.stream();
        Stream<Book> skipthreebooks2 = skipThreeBooks.skip(3);
        skipthreebooks2.forEach(System.out::println);

    }










    static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 20;
        }
    };


}
