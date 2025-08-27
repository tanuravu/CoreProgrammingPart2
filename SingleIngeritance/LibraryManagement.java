package Inheritance.AssistedSingleInheritance;

// Superclass: Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call parent constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent class method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Test class
public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Java Programming", 2022, "James Gosling", "Father of Java");
        a.displayInfo();
    }
}
