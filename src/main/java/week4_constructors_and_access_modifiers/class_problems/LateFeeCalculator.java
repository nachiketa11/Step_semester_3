package week4_constructors_and_access_modifiers.class_problems;

public class LateFeeCalculator {

    public static void calculateLateFees(int[] daysLate, double dailyRate) {
        if (daysLate == null) return;
        System.out.println("=== Late Fees Calculation (Skip On-Time Accounts) ===");

        for (int i = 0; i < daysLate.length; i++) {
            int days = daysLate[i];
            if (days <= 0) {
                System.out.printf("Account %d: On-Time (Skipped)%n", (i + 1));
                continue;
            }
            double fee = days * dailyRate;
            System.out.printf("Account %d: %d days late -> Late Fee = Rs %.2f%n", (i + 1), days, fee);
        }
    }

    public static void main(String[] args) {
        int[] batchDaysLate = {0, 3, 0, 5, 1, 0};
        double ratePerDay = 50.0;
        calculateLateFees(batchDaysLate, ratePerDay);
    }
}
