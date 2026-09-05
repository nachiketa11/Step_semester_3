package week1_strings.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        if (text == null) return false;
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null) return false;
        return isPalindromeRecursiveHelper(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursiveHelper(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return isPalindromeRecursiveHelper(text, left + 1, right - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) return false;
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return new String(reversed).equals(text);
    }

    public static void main(String[] args) {
        String[] testCases = {"madam", "hello", "racecar", "step"};
        System.out.println("=== Palindrome Checker (3 Approaches) ===");
        for (String test : testCases) {
            boolean iter = isPalindromeIterative(test);
            boolean recur = isPalindromeRecursive(test);
            boolean rev = isPalindromeArrayReversal(test);

            String iterStr = iter ? "Palindrome" : "Not Palindrome";
            String recurStr = recur ? "Palindrome" : "Not Palindrome";
            String revStr = rev ? "Palindrome" : "Not Palindrome";

            System.out.printf("Input: \"%s\" -> Iterative: %s | Recursive: %s | Array Reversal: %s%n",
                    test, iterStr, recurStr, revStr);
        }
    }
}
