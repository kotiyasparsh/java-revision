package intermideate;

public class Book {

    String title;
    int publicationYear;
    double price;
    String category;

    public Book(String title, int publicationYear, double price, String category){
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
