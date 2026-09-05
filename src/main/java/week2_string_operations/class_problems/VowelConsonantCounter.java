package week2_string_operations.class_problems;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String text) {
        if (text == null) {
            System.out.println("Invalid Input Text");
            return;
        }

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.printf("Text: \"%s\" -> Vowels: %d | Consonants: %d%n", text, vowels, consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Java Programming");
        countVowelsAndConsonants("STEP Semester 3 Coursework");
    }
}
