package week3_oop.class_problems;

public class Course {

    private String courseName;
    private double fee;
    private int durationMonths;

    public Course() {
        this("Unassigned", 0.0, 0);
    }

    public Course(String courseName, double fee) {
        this(courseName, fee, 3); // default 3 months
    }

    public Course(String courseName, double fee, int durationMonths) {
        this.courseName = courseName;
        this.fee = fee;
        this.durationMonths = durationMonths;
    }

    public void displayCourseDetails() {
        System.out.printf("Course: %-15s | Fee: Rs %-8.2f | Duration: %d months%n", courseName, fee, durationMonths);
    }

    public static void main(String[] args) {
        System.out.println("=== Overloaded Constructors for a Course ===");
        Course c1 = new Course();
        Course c2 = new Course("Java Programming", 15000.0);
        Course c3 = new Course("Data Science", 25000.0, 6);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
