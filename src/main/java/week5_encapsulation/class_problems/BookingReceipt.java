package week5_encapsulation.class_problems;

import java.util.Arrays;

public class BookingReceipt {

    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(String bookingId, String[] seatNumbers) {
        this.bookingId = bookingId;
        if (seatNumbers != null) {
            this.seatNumbers = Arrays.copyOf(seatNumbers, seatNumbers.length); // defensive copy in
        } else {
            this.seatNumbers = new String[0];
        }
    }

    public String getBookingId() {
        return bookingId;
    }

    public String[] getSeatNumbers() {
        return Arrays.copyOf(seatNumbers, seatNumbers.length); // defensive copy out
    }

    public BookingReceipt withUpdatedSeat(int index, String newSeat) {
        String[] updatedSeats = getSeatNumbers();
        if (index >= 0 && index < updatedSeats.length) {
            updatedSeats[index] = newSeat;
        }
        return new BookingReceipt(this.bookingId, updatedSeats);
    }
}

class GroupBookingReceipt extends BookingReceipt {
    private final int groupSize;

    public GroupBookingReceipt(String bookingId, String[] seatNumbers, int groupSize) {
        super(bookingId, seatNumbers);
        this.groupSize = groupSize;
    }

    public int getGroupSize() {
        return groupSize;
    }
}

class NightlySettlement {

    public static String processNightlySettlement(BookingReceipt[] receipts) {
        if (receipts == null) {
            return "0 processed | 0 null skipped | 0 group | 0 individual";
        }

        int totalProcessed = 0;
        int nullSkipped = 0;
        int groupCount = 0;
        int individualCount = 0;

        for (BookingReceipt r : receipts) {
            if (r == null) {
                nullSkipped++;
                continue;
            }

            totalProcessed++;
            if (r instanceof GroupBookingReceipt) {
                groupCount++;
            } else {
                individualCount++;
            }
        }

        return String.format("%d processed | %d null skipped | %d group | %d individual",
                totalProcessed, nullSkipped, groupCount, individualCount);
    }

    public static void main(String[] args) {
        System.out.println("=== Immutable Booking Receipt & Nightly Settlement ===");
        BookingReceipt b = new BookingReceipt("CH-1001", new String[]{"A1", "A2"});
        String[] seats = b.getSeatNumbers();
        seats[0] = "X"; // attempting external mutation
        System.out.println("Seat 0 after external array mutation: " + b.getSeatNumbers()[0]); // "A1"

        BookingReceipt updated = b.withUpdatedSeat(1, "A3");
        System.out.println("Original Receipts Seats: " + Arrays.toString(b.getSeatNumbers())); // ["A1", "A2"]
        System.out.println("Updated Receipts Seats:  " + Arrays.toString(updated.getSeatNumbers())); // ["A1", "A3"]

        BookingReceipt[] batch = {
            new GroupBookingReceipt("CH-2002", new String[]{"B1", "B2"}, 2),
            null,
            new BookingReceipt("CH-3003", new String[]{"C1"})
        };

        String settlementReport = processNightlySettlement(batch);
        System.out.println("Nightly Settlement Report: " + settlementReport);
    }
}
