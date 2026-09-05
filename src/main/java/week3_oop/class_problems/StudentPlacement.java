package week3_oop.class_problems;

public class StudentPlacement {

    private String name;
    private String company;
    private double packageLpa;

    public StudentPlacement(String name, String company, double packageLpa) {
        this.name = name;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    public void displayPlacement() {
        System.out.printf("%s -> %s @ %.1f LPA%n", name, company, packageLpa);
    }

    public static void main(String[] args) {
        System.out.println("=== From Parallel Arrays to a Class ===");
        StudentPlacement s1 = new StudentPlacement("Ravi", "TCS", 4.5);
        StudentPlacement s2 = new StudentPlacement("Karthik", "Infosys", 4.0);

        s1.displayPlacement();
        s2.displayPlacement();
    }
}
