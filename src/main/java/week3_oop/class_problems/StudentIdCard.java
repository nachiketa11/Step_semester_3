package week3_oop.class_problems;

public class StudentIdCard {

    private String studentName;
    private String idNumber;

    public StudentIdCard(String studentName, String idNumber) {
        this.studentName = studentName;
        this.idNumber = idNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void displayCard() {
        System.out.printf("ID Card [%s]: Name = %s%n", idNumber, studentName);
    }

    public static void main(String[] args) {
        System.out.println("=== Reference Copies and a Shared ID Card ===");
        StudentIdCard originalCard = new StudentIdCard("Aarav", "CARD-991");
        StudentIdCard aliasCard = originalCard; // reference copy

        System.out.print("Before Modification (Original): ");
        originalCard.displayCard();
        System.out.print("Before Modification (Alias):    ");
        aliasCard.displayCard();

        aliasCard.setStudentName("Aarav Sharma");

        System.out.println("\nAfter Modifying Alias Card:");
        System.out.print("Original Card: ");
        originalCard.displayCard();
        System.out.print("Alias Card:    ");
        aliasCard.displayCard();
    }
}
