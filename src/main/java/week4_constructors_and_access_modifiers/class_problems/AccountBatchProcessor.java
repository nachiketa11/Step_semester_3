package week4_constructors_and_access_modifiers.class_problems;

class FeeAccount {
    protected String accountId;
    protected double amountDue;

    public FeeAccount(String accountId, double amountDue) {
        this.accountId = accountId;
        this.amountDue = amountDue;
    }

    public double calculateFinalAmount() {
        return amountDue;
    }

    public String getAccountId() {
        return accountId;
    }
}

class DiscountedFeeAccount extends FeeAccount {
    private double discountPercentage;

    public DiscountedFeeAccount(String accountId, double amountDue, double discountPercentage) {
        super(accountId, amountDue);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateFinalAmount() {
        return amountDue * (1.0 - discountPercentage / 100.0);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}

public class AccountBatchProcessor {

    public static void processBatch(FeeAccount[] accounts) {
        if (accounts == null) return;
        System.out.println("=== Account Batch Payments ===");
        double totalCollected = 0;

        for (FeeAccount acc : accounts) {
            double finalAmt = acc.calculateFinalAmount();
            totalCollected += finalAmt;

            if (acc instanceof DiscountedFeeAccount) {
                DiscountedFeeAccount dAcc = (DiscountedFeeAccount) acc;
                System.out.printf("Account %s [Discounted %.0f%%]: Original = Rs %.2f | Charged = Rs %.2f%n",
                        acc.getAccountId(), dAcc.getDiscountPercentage(), acc.amountDue, finalAmt);
            } else {
                System.out.printf("Account %s [Standard]: Charged = Rs %.2f%n",
                        acc.getAccountId(), finalAmt);
            }
        }
        System.out.printf("Total Batch Collected: Rs %.2f%n", totalCollected);
    }

    public static void main(String[] args) {
        FeeAccount[] batch = {
            new FeeAccount("ACC-01", 10000.0),
            new DiscountedFeeAccount("ACC-02", 15000.0, 10.0),
            new FeeAccount("ACC-03", 8000.0),
            new DiscountedFeeAccount("ACC-04", 20000.0, 15.0)
        };

        processBatch(batch);
    }
}
