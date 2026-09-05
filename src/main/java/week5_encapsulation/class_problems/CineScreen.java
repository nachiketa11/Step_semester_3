package week5_encapsulation.class_problems;

public class CineScreen {

    private final int seatsTotal;
    private int seatsAvailable;

    public CineScreen(int seatsTotal) {
        if (seatsTotal <= 0) {
            System.out.println("construction rejected: seatsTotal must be greater than zero");
            this.seatsTotal = 0;
            this.seatsAvailable = 0;
        } else {
            this.seatsTotal = seatsTotal;
            this.seatsAvailable = seatsTotal;
        }
    }

    public void bookSeat() {
        if (seatsTotal <= 0) return;
        if (seatsAvailable > 0) {
            seatsAvailable--;
        } else {
            // silently reject transition out of bounds
        }
    }

    public void cancelBooking() {
        if (seatsTotal <= 0) return;
        if (seatsAvailable < seatsTotal) {
            seatsAvailable++;
        } else {
            // silently reject transition out of bounds
        }
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public int getSeatsTotal() {
        return seatsTotal;
    }

    public static void main(String[] args) {
        System.out.println("=== Seat Booking Encapsulation Guard ===");
        System.out.print("Testing new CineScreen(0): ");
        CineScreen c0 = new CineScreen(0);

        System.out.println("\nTesting CineScreen(2) overbooking:");
        CineScreen c = new CineScreen(2);
        c.bookSeat();
        c.bookSeat();
        c.bookSeat(); // 3rd booking rejected
        System.out.println("Available Seats after 3 bookings: " + c.getSeatsAvailable()); // 0

        System.out.println("\nTesting cancellation over-limit:");
        c.cancelBooking();
        c.cancelBooking();
        c.cancelBooking(); // 3rd cancellation rejected
        System.out.println("Available Seats after 3 cancellations: " + c.getSeatsAvailable()); // 2
    }
}
