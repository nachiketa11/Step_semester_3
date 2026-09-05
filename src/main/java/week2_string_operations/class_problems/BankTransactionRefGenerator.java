package week2_string_operations.class_problems;

import java.util.Random;

public class BankTransactionRefGenerator {

    public static String generateTransactionRef() {
        StringBuilder sb = new StringBuilder("TXN-");
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    public static boolean validateTransactionRef(String ref) {
        if (ref == null || !ref.startsWith("TXN-") || ref.length() != 12) {
            return false;
        }

        String digits = ref.substring(4);
        for (int i = 0; i < digits.length(); i++) {
            if (!Character.isDigit(digits.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== Bank Transaction Reference Generator & Validator ===");
        for (int i = 0; i < 3; i++) {
            String ref = generateTransactionRef();
            boolean valid = validateTransactionRef(ref);
            System.out.printf("Generated Ref: %s | Valid: %b%n", ref, valid);
        }

        String invalidRef = "TXN-1234A567";
        System.out.printf("Checking Invalid Ref '%s': %b%n", invalidRef, validateTransactionRef(invalidRef));
    }
}
