package week3_oop.assigment_problems;

public class BookInventory {

    private String title;
    private String author;
    private int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.printf("Book: %-25s | Author: %-15s | Copies: %d%n", title, author, copiesAvailable);
    }

    public static void main(String[] args) {
        System.out.println("=== Library Inventory (From Parallel Arrays to a Class) ===");
        BookInventory b1 = new BookInventory("Effective Java", "Joshua Bloch", 5);
        BookInventory b2 = new BookInventory("Clean Code", "Robert C. Martin", 3);

        b1.printEntry();
        b2.printEntry();
    }
}
