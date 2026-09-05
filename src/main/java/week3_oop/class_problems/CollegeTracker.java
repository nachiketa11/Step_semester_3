package week3_oop.class_problems;

public class CollegeTracker {

    // Static members (shared across all instances)
    public static String collegeName = "SRM University";
    public static int totalStudents = 0;

    // Instance members (unique per object)
    private String studentName;
    private int rollNo;

    public CollegeTracker(String studentName) {
        this.studentName = studentName;
        totalStudents++;
        this.rollNo = totalStudents;
    }

    public void displayStudentInfo() {
        System.out.printf("Roll No: %d | Name: %-10s | College: %s%n", rollNo, studentName, collegeName);
    }

    public static void displayTotalCount() {
        System.out.println("Total Students Enrolled in " + collegeName + ": " + totalStudents);
    }

    public static void main(String[] args) {
        System.out.println("=== Instance vs Static: Splitting a Class Correctly ===");
        CollegeTracker s1 = new CollegeTracker("Ananya");
        CollegeTracker s2 = new CollegeTracker("Rohan");
        CollegeTracker s3 = new CollegeTracker("Priya");

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        CollegeTracker.displayTotalCount();
    }
}
