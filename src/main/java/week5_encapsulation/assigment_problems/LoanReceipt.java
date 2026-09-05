package week5_encapsulation.assigment_problems;

import java.util.Arrays;

public class LoanReceipt {

    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds) {
        this.memberId = memberId;
        if (bookIds != null) {
            this.bookIds = Arrays.copyOf(bookIds, bookIds.length); // defensive copy in
        } else {
            this.bookIds = new String[0];
        }
    }

    public String getMemberId() {
        return memberId;
    }

    public String[] getBookIds() {
        return Arrays.copyOf(bookIds, bookIds.length); // defensive copy out
    }

    public LoanReceipt withCorrectedBookId(int index, String newId) {
        String[] updatedBookIds = getBookIds();
        if (index >= 0 && index < updatedBookIds.length) {
            updatedBookIds[index] = newId;
        }
        return new LoanReceipt(this.memberId, updatedBookIds);
    }
}

class ReferenceOnlyLoanReceipt extends LoanReceipt {
    private final String roomNumber;

    public ReferenceOnlyLoanReceipt(String memberId, String[] bookIds, String roomNumber) {
        super(memberId, bookIds);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}

class CirculationLedger {

    public static String sharedBranchCode;

    static {
        sharedBranchCode = "MAIN-LIB-01";
        System.out.println("[STATIC BLOCK] Initialized Circulation Ledger Branch: " + sharedBranchCode);
    }

    public static String processNightlyCirculation(LoanReceipt[] receipts) {
        if (receipts == null) {
            return "0 processed | 0 null skipped | 0 reference-only | 0 regular";
        }

        int totalProcessed = 0;
        int nullSkipped = 0;
        int refOnlyCount = 0;
        int regularCount = 0;

        for (LoanReceipt r : receipts) {
            if (r == null) {
                nullSkipped++;
                continue;
            }

            totalProcessed++;
            if (r instanceof ReferenceOnlyLoanReceipt) {
                refOnlyCount++;
            } else {
                regularCount++;
            }
        }

        return String.format("%d processed | %d null skipped | %d reference-only | %d regular",
                totalProcessed, nullSkipped, refOnlyCount, regularCount);
    }

    public static void main(String[] args) {
        System.out.println("=== Immutable Loan Receipt & Nightly Circulation Ledger ===");
        LoanReceipt r = new LoanReceipt("LIB-8841", new String[]{"BK-100", "BK-101"});
        String[] ids = r.getBookIds();
        ids[0] = "HACKED"; // attempting external array mutation
        System.out.println("Book 0 after external array mutation attempt: " + r.getBookIds()[0]); // "BK-100"

        LoanReceipt corrected = r.withCorrectedBookId(1, "BK-102");
        System.out.println("Original Receipt Books:  " + Arrays.toString(r.getBookIds())); // ["BK-100", "BK-101"]
        System.out.println("Corrected Receipt Books: " + Arrays.toString(corrected.getBookIds())); // ["BK-100", "BK-102"]

        LoanReceipt[] batch = {
            new ReferenceOnlyLoanReceipt("LIB-001", new String[]{"BK-200"}, "Reading Room 3"),
            null,
            new LoanReceipt("LIB-002", new String[]{"BK-201"})
        };

        String report = processNightlyCirculation(batch);
        System.out.println("Nightly Circulation Report: " + report);
    }
}
