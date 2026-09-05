package week4_constructors_and_access_modifiers.class_problems;

public class BookCatalog {

    private String title;
    private String author;
    private String isbn;

    // Constructor chaining using this()
    public BookCatalog(String title, String author) {
        this(title, author, "PENDING_ISBN");
    }

    public BookCatalog(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.printf("Book: %-25s | Author: %-15s | ISBN: %s%n", title, author, isbn);
    }

    public static void main(String[] args) {
        System.out.println("=== Library Book Cataloguing (Constructor Chaining) ===");
        BookCatalog b1 = new BookCatalog("Java Performance", "Charlie Hunt");
        BookCatalog b2 = new BookCatalog("Operating System Concepts", "Silberschatz", "978-1118063330");

        b1.displayBook();
        b2.displayBook();
    }
}
