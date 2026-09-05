package week3_oop.assigment_problems;

public class PayrollAccount {

    private String employeeId;
    private double netSalary;

    public PayrollAccount(String employeeId, double initialSalary) {
        this.employeeId = employeeId;
        if (initialSalary >= 0) {
            this.netSalary = initialSalary;
        } else {
            this.netSalary = 0;
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void addBonus(double amount) {
        if (amount > 0) {
            netSalary += amount;
            System.out.printf("Bonus added: Rs %.2f. Updated Salary: Rs %.2f%n", amount, netSalary);
        } else {
            System.out.println("Invalid bonus amount.");
        }
    }

    public boolean processDeduction(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deduction amount.");
            return false;
        }
        if (netSalary >= amount) {
            netSalary -= amount;
            System.out.printf("Deduction processed: Rs %.2f. Remaining Salary: Rs %.2f%n", amount, netSalary);
            return true;
        } else {
            System.out.printf("Deduction failed (amount Rs %.2f exceeds salary Rs %.2f).%n", amount, netSalary);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Encapsulated Payroll Account ===");
        PayrollAccount acc = new PayrollAccount("EMP-501", 50000.0);
        acc.addBonus(5000.0);
        acc.processDeduction(2000.0);
        acc.processDeduction(60000.0);
    }
}
