package week3_oop.assigment_problems;

public class ExamHallTicket {

    private String candidateName;
    private String examCenter;

    public ExamHallTicket(String candidateName, String examCenter) {
        this.candidateName = candidateName;
        this.examCenter = examCenter;
    }

    public void setExamCenter(String examCenter) {
        this.examCenter = examCenter;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getExamCenter() {
        return examCenter;
    }

    public void displayTicket() {
        System.out.printf("Candidate: %-12s | Center: %s%n", candidateName, examCenter);
    }

    public static void main(String[] args) {
        System.out.println("=== Reference Copies and a Shared Exam Hall Ticket ===");
        ExamHallTicket originalTicket = new ExamHallTicket("Neha", "Hall A");
        ExamHallTicket sharedTicket = originalTicket; // shared reference

        System.out.print("Original Ticket: ");
        originalTicket.displayTicket();
        System.out.print("Shared Ticket:   ");
        sharedTicket.displayTicket();

        System.out.println("\nUpdating Exam Center via Shared Ticket reference to 'Hall B'...");
        sharedTicket.setExamCenter("Hall B");

        System.out.print("Original Ticket: ");
        originalTicket.displayTicket();
        System.out.print("Shared Ticket:   ");
        sharedTicket.displayTicket();
    }
}
