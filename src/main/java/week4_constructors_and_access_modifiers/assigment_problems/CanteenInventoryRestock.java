package week4_constructors_and_access_modifiers.assigment_problems;

public class CanteenInventoryRestock {

    private String itemName;
    private int stockQuantity;

    public CanteenInventoryRestock(String itemName, int stockQuantity) {
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
    }

    // Using 'this' to distinguish parameter from instance field during restock
    public void restock(int stockQuantity) {
        if (stockQuantity > 0) {
            this.stockQuantity += stockQuantity;
            System.out.printf("Restocked %-12s by %d units. New Stock: %d%n",
                    this.itemName, stockQuantity, this.stockQuantity);
        }
    }

    public void displayStock() {
        System.out.printf("Item: %-12s | Current Stock: %d%n", itemName, stockQuantity);
    }

    public static void main(String[] args) {
        System.out.println("=== Canteen Inventory – Batch Restock ===");
        CanteenInventoryRestock i1 = new CanteenInventoryRestock("Sandwich", 15);
        CanteenInventoryRestock i2 = new CanteenInventoryRestock("Juice Box", 20);

        int restockQty = 30; // restock quantity applied to all items

        i1.restock(restockQty);
        i2.restock(restockQty);
    }
}
