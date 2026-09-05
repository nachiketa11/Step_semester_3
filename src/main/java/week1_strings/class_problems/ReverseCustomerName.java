package week1_strings.class_problems;

public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {
        if (customerName == null) return null;
        char[] chars = customerName.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] names = {"Sunil", "Nachiketa", "Rahul"};
        System.out.println("=== Customer Identity Verification System ===");
        for (String name : names) {
            String reversed = reverseCustomerName(name);
            System.out.printf("Original Name: %s | Reversed Name: %s%n", name, reversed);
        }
    }
}
