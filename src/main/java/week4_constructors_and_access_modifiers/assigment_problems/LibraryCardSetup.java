package week4_constructors_and_access_modifiers.assigment_problems;

public class LibraryCardSetup {

    public static String libraryName;
    public static String defaultValidityPeriod;

    // Static block loads configuration once
    static {
        libraryName = "Central Campus Library";
        defaultValidityPeriod = "4 Years (2026-2030)";
        System.out.println("[STATIC BLOCK] Library Configuration Loaded: " + libraryName + " | Validity: " + defaultValidityPeriod);
    }

    private String studentName;
    private String cardId;

    public LibraryCardSetup(String studentName, String cardId) {
        this.studentName = studentName;
        this.cardId = cardId;
    }

    public void displayCard() {
        System.out.printf("Library Card [%s]: %-12s | Library: %s | Validity: %s%n",
                cardId, studentName, libraryName, defaultValidityPeriod);
    }

    public static void main(String[] args) {
        System.out.println("=== Library Membership Card Setup ===");
        LibraryCardSetup c1 = new LibraryCardSetup("Aditya", "LIB-001");
        LibraryCardSetup c2 = new LibraryCardSetup("Bhavna", "LIB-002");

        c1.displayCard();
        c2.displayCard();
    }
}
