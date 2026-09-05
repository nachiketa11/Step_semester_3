package week2_string_operations.assigment_problems;

public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder revWord = new StringBuilder(words[i]);
            result.append(revWord.reverse().toString());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello club";
        String encoded = reverseEachWord(input);
        System.out.printf("Input: \"%s\" -> Encoded: \"%s\"%n", input, encoded);
    }
}
