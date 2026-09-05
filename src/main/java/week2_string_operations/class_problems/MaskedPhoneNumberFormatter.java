package week2_string_operations.class_problems;

public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null) {
            return "Invalid Phone Number";
        }

        // Clean all non-digit characters
        String cleaned = phone.replaceAll("\\D", "");

        if (cleaned.length() != 10) {
            return "Invalid Phone Number — must contain 10 digits";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append("*");
        }
        sb.append(cleaned.substring(6));
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] testPhones = {"9876543210", "123-456-7890", "99988877", "987654321099"};
        System.out.println("=== Masked Phone Number Formatter ===");
        for (String phone : testPhones) {
            String masked = maskPhoneNumber(phone);
            System.out.printf("Raw: %-15s -> Masked: %s%n", phone, masked);
        }
    }
}
