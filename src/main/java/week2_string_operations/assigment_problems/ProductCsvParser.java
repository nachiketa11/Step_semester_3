package week2_string_operations.assigment_problems;

public class ProductCsvParser {

    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null || csvLine.trim().isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String qty = fields[2].trim();

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", productName, sku, qty);
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        parseInventoryRecord("Wireless Mouse,WM-2201,150");

        System.out.println("--- Test Case 2 ---");
        parseInventoryRecord("Wireless Mouse,150");
    }
}
