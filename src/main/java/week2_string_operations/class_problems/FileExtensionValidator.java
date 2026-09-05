package week2_string_operations.class_problems;

public class FileExtensionValidator {

    private static final String[] VALID_EXTENSIONS = {".jpg", ".jpeg", ".png", ".pdf", ".docx"};

    public static boolean isValidFileExtension(String filename) {
        if (filename == null || filename.isEmpty()) {
            return false;
        }

        int lastDotIndex = filename.lastIndexOf(".");
        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return false;
        }

        String extension = filename.substring(lastDotIndex).toLowerCase();
        for (String validExt : VALID_EXTENSIONS) {
            if (validExt.equals(extension)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] files = {"report.pdf", "image.PNG", "archive.zip", "document.docx", "no_extension"};
        System.out.println("=== File Extension Validator ===");
        for (String file : files) {
            boolean valid = isValidFileExtension(file);
            System.out.printf("File: %-15s -> Valid: %s%n", file, valid);
        }
    }
}
