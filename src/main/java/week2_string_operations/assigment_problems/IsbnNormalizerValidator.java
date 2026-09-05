package week2_string_operations.assigment_problems;

public class IsbnNormalizerValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) return "";
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed.toUpperCase();
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) {
            return "Invalid: wrong length (must be exactly 13 characters)";
        }

        // first 3 characters must be letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // remaining 10 characters must be digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ");
        sb.append("YEAR: ").append(year).append(" | ");
        sb.append("CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] testInputs = {"  pen2026004251  ", "12N2026004251", "abc202612345"};

        for (String input : testInputs) {
            String normalized = normalizeCode(input);
            String result = validateAndFormat(normalized);
            System.out.printf("Raw: \"%s\" -> Output: %s%n", input, result);
        }
    }
}
