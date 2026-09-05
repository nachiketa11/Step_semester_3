package week2_string_operations.assigment_problems;

public class AtmPinValidator {

    public static void checkPinLength(String pin) {
        if (pin == null) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
            return;
        }

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- PIN: \"482\" ---");
        checkPinLength("482");

        System.out.println("--- PIN: \"4820\" ---");
        checkPinLength("4820");
    }
}
