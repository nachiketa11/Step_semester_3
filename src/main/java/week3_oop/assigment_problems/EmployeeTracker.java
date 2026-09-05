package week3_oop.assigment_problems;

public class EmployeeTracker {

    // Static members (company level)
    public static String companyName = "TechCorp Solutions";
    public static int totalEmployees = 0;

    // Instance members (employee level)
    private String empName;
    private int empId;

    public EmployeeTracker(String empName) {
        this.empName = empName;
        totalEmployees++;
        this.empId = 1000 + totalEmployees;
    }

    public void displayEmployeeDetails() {
        System.out.printf("Emp ID: %d | Name: %-12s | Company: %s%n", empId, empName, companyName);
    }

    public static void displayCompanySummary() {
        System.out.printf("Total Workforce at %s: %d employees%n", companyName, totalEmployees);
    }

    public static void main(String[] args) {
        System.out.println("=== Instance vs Static: Splitting an Employee Class Correctly ===");
        EmployeeTracker e1 = new EmployeeTracker("Karan");
        EmployeeTracker e2 = new EmployeeTracker("Divya");
        EmployeeTracker e3 = new EmployeeTracker("Amit");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        EmployeeTracker.displayCompanySummary();
    }
}
