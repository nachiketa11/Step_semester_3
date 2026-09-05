package week1_strings.class_problems;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return '\0';
        }

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < 256) {
                freq[ch]++;
            }
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < 256 && freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String[] testCases = {"swiss", "aabbcc", "developer", "automation"};
        System.out.println("=== First Non-Repeating Character ===");
        for (String test : testCases) {
            char result = findFirstNonRepeatingChar(test);
            if (result != '\0') {
                System.out.printf("Input: \"%s\" -> First Non-Repeating Character: '%c'%n", test, result);
            } else {
                System.out.printf("Input: \"%s\" -> No Non-Repeating Character Found%n", test);
            }
        }
    }
}
