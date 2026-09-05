package week5_encapsulation.assigment_problems;

public class BookInventoryGuard {

    private final int copiesTotal;
    private int copiesAvailable;

    public BookInventoryGuard(int copiesTotal) {
        if (copiesTotal <= 0) {
            System.out.println("construction rejected: copiesTotal must be greater than zero");
            this.copiesTotal = 0;
            this.copiesAvailable = 0;
        } else {
            this.copiesTotal = copiesTotal;
            this.copiesAvailable = copiesTotal;
        }
    }

    public void checkoutBook() {
        if (copiesTotal <= 0) return;
        if (copiesAvailable > 0) {
            copiesAvailable--;
        } else {
            // silently reject transition out of bounds
        }
    }

    public void returnBook() {
        if (copiesTotal <= 0) return;
        if (copiesAvailable < copiesTotal) {
            copiesAvailable++;
        } else {
            // silently reject transition out of bounds
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public int getCopiesTotal() {
        return copiesTotal;
    }

    public static void main(String[] args) {
        System.out.println("=== Book Copy Circulation Guard ===");
        System.out.print("Testing new BookInventoryGuard(0): ");
        BookInventoryGuard b0 = new BookInventoryGuard(0);

        BookInventoryGuard b = new BookInventoryGuard(2);
        b.checkoutBook();
        b.checkoutBook();
        b.checkoutBook(); // 3rd checkout rejected
        System.out.println("Available Copies after 3 checkouts: " + b.getCopiesAvailable()); // 0

        b.returnBook();
        b.returnBook();
        b.returnBook(); // 3rd return rejected
        System.out.println("Available Copies after 3 returns: " + b.getCopiesAvailable()); // 2
    }
}
