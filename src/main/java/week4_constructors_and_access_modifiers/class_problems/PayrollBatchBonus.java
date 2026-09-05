package week4_constructors_and_access_modifiers.class_problems;

public class PayrollBatchBonus {

    public static void applyFestivalBonus(double[] salaries, double bonusAmount) {
        if (salaries == null) return;
        System.out.println("=== Payroll Batch Bonus Round ===");
        for (int i = 0; i < salaries.length; i++) {
            double original = salaries[i];
            salaries[i] += bonusAmount;
            System.out.printf("Employee %d: Original Salary = Rs %.2f | Updated Salary = Rs %.2f%n",
                    (i + 1), original, salaries[i]);
        }
    }

    public static void main(String[] args) {
        double[] teamSalaries = {45000.0, 52000.0, 60000.0, 38000.0};
        double festivalBonus = 5000.0;
        applyFestivalBonus(teamSalaries, festivalBonus);
    }
}
