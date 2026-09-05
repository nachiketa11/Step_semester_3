package week1_strings.assigment_problems;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid Input Strings");
            return;
        }

        int length = Math.min(original.length(), typed.length());
        int matched = 0;
        int firstMismatchPos = -1;
        char origCharMismatch = '\0';
        char typedCharMismatch = '\0';

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                if (firstMismatchPos == -1) {
                    firstMismatchPos = i + 1; // 1-indexed position
                    origCharMismatch = original.charAt(i);
                    typedCharMismatch = typed.charAt(i);
                }
            }
        }

        double accuracy = ((double) matched / original.length()) * 100.0;

        if (firstMismatchPos != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, original.length(), accuracy, firstMismatchPos, origCharMismatch, typedCharMismatch);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, original.length(), accuracy);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("--- Test Case 2 ---");
        checkTypingAccuracy("coding", "coding");
    }
}
