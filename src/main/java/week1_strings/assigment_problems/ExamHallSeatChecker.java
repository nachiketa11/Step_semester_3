package week1_strings.assigment_problems;

public class ExamHallSeatChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Seat Numbers Provided");
            return;
        }

        boolean duplicateFound = false;
        // Compare every seat against every other using loops (no Collections)
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] test1 = {101, 102, 103, 102, 105};
        int[] test2 = {101, 102, 103, 104, 105};

        System.out.println("--- Test Case 1 ---");
        checkDuplicateSeats(test1);

        System.out.println("--- Test Case 2 ---");
        checkDuplicateSeats(test2);
    }
}
