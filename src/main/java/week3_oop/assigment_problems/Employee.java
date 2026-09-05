package week3_oop.assigment_problems;

public class Employee {

    private String empName;
    private String department;
    private double baseSalary;

    public Employee() {
        this("Unassigned", "General", 30000.0);
    }

    public Employee(String empName, String department) {
        this(empName, department, 40000.0);
    }

    public Employee(String empName, String department, double baseSalary) {
        this.empName = empName;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.printf("Employee: %-15s | Department: %-12s | Base Salary: Rs %.2f%n", empName, department, baseSalary);
    }

    public static void main(String[] args) {
        System.out.println("=== Overloaded Constructors for an Employee ===");
        Employee e1 = new Employee();
        Employee e2 = new Employee("Vikram", "IT");
        Employee e3 = new Employee("Siddharth", "R&D", 75000.0);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
