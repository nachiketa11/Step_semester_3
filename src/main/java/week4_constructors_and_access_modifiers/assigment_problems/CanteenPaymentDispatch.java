package week4_constructors_and_access_modifiers.assigment_problems;

class CanteenPayment {
    protected double baseAmount;

    public CanteenPayment(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public double getFinalAmount() {
        return baseAmount;
    }
}

class CashPayment extends CanteenPayment {
    public CashPayment(double baseAmount) {
        super(baseAmount);
    }
}

class CardPayment extends CanteenPayment {
    private double serviceFeePercentage;

    public CardPayment(double baseAmount, double serviceFeePercentage) {
        super(baseAmount);
        this.serviceFeePercentage = serviceFeePercentage;
    }

    @Override
    public double getFinalAmount() {
        return baseAmount * (1.0 + serviceFeePercentage / 100.0);
    }
}

public class CanteenPaymentDispatch {

    public static void processClosingDispatch(CanteenPayment[] transactions) {
        if (transactions == null) return;
        System.out.println("=== Canteen Closing-Time Payment Dispatch ===");
        double totalCollected = 0;

        for (CanteenPayment p : transactions) {
            double amount = p.getFinalAmount();
            totalCollected += amount;

            if (p instanceof CardPayment) {
                System.out.printf("Charged (card, incl. fee): Rs %.1f%n", amount);
            } else if (p instanceof CashPayment) {
                System.out.printf("Paid (cash): Rs %.1f%n", amount);
            } else {
                System.out.printf("Processed Payment: Rs %.1f%n", amount);
            }
        }
        System.out.printf("Total Collected: Rs %.1f%n", totalCollected);
    }

    public static void main(String[] args) {
        CanteenPayment[] dailyBatch = {
            new CardPayment(100.0, 2.0),
            new CashPayment(50.0),
            new CardPayment(200.0, 2.0),
            new CashPayment(75.0),
            new CardPayment(120.0, 2.0)
        };

        processClosingDispatch(dailyBatch);
    }
}
