package week3_oop.class_problems;

public class MessCardWallet {

    private String studentId;
    private double balance;

    public MessCardWallet(String studentId, double initialBalance) {
        this.studentId = studentId;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public double getBalance() {
        return balance;
    }

    public void recharge(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Recharged Rs %.2f. New Balance: Rs %.2f%n", amount, balance);
        } else {
            System.out.println("Invalid recharge amount.");
        }
    }

    public boolean deductMeal(double cost) {
        if (cost <= 0) {
            System.out.println("Invalid meal cost.");
            return false;
        }
        if (balance >= cost) {
            balance -= cost;
            System.out.printf("Meal deducted: Rs %.2f. Remaining Balance: Rs %.2f%n", cost, balance);
            return true;
        } else {
            System.out.printf("Insufficient balance for meal cost Rs %.2f. Current Balance: Rs %.2f%n", cost, balance);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Encapsulated Mess-Card Wallet ===");
        MessCardWallet wallet = new MessCardWallet("STU1001", 500.0);
        wallet.deductMeal(80.0);
        wallet.recharge(200.0);
        wallet.deductMeal(700.0);
    }
}
