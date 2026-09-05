package week4_constructors_and_access_modifiers.class_problems;

public class CollegeSetup {

    public static String collegeName;
    public static String academicYear;

    // Static initialization block runs exactly once when class is loaded
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-2027";
        System.out.println("[STATIC BLOCK] Initialized College Setup: " + collegeName + " (" + academicYear + ")");
    }

    private String studentName;
    private String regNo;

    public CollegeSetup(String studentName, String regNo) {
        this.studentName = studentName;
        this.regNo = regNo;
    }

    public void displayStudent() {
        System.out.printf("Student: %-12s | RegNo: %-10s | College: %s (%s)%n",
                studentName, regNo, collegeName, academicYear);
    }

    public static void main(String[] args) {
        System.out.println("=== One-Time College Setup, Many Students ===");
        CollegeSetup s1 = new CollegeSetup("Rahul", "REG101");
        CollegeSetup s2 = new CollegeSetup("Sneha", "REG102");

        s1.displayStudent();
        s2.displayStudent();
    }
}
