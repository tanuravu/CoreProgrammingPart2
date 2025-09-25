import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private List<Book> books;  // Aggregation (Library has Books)

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);   // Books are passed from outside
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(" - " + book.getDetails());
        }
    }
}

public class problem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python 101", "Guido van Rossum");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  // Same book can be in another library

        lib1.showBooks();
        lib2.showBooks();
    }
}
