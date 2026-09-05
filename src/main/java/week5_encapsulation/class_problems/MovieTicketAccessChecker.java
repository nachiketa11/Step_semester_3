package week5_encapsulation.class_problems;

class MovieTicket {
    private String seatNumber;
    String screenId; // default
    protected double ticketPrice;
    public String movieTitle;

    public MovieTicket(String seatNumber, String screenId, double ticketPrice, String movieTitle) {
        this.seatNumber = seatNumber;
        this.screenId = screenId;
        this.ticketPrice = ticketPrice;
        this.movieTitle = movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}

public class MovieTicketAccessChecker {

    public static String classifyAccess(String fieldModifier, String accessorContext) {
        if (fieldModifier == null || accessorContext == null) {
            return "DENIED";
        }

        switch (fieldModifier) {
            case "public":
                return "ALLOWED";

            case "protected":
                if (accessorContext.equals("SAME_CLASS") ||
                    accessorContext.equals("SAME_PACKAGE") ||
                    accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {
                    return "ALLOWED";
                } else {
                    return "DENIED"; // e.g. DIFFERENT_PACKAGE, SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE
                }

            case "default":
                if (accessorContext.equals("SAME_CLASS") || accessorContext.equals("SAME_PACKAGE")) {
                    return "ALLOWED";
                } else {
                    return "DENIED";
                }

            case "private":
                if (accessorContext.equals("SAME_CLASS")) {
                    return "ALLOWED";
                } else {
                    return "DENIED";
                }

            default:
                return "DENIED";
        }
    }

    public static String summarizeBatch(String[][] attempts) {
        if (attempts == null) return "Allowed: 0 | Denied: 0";
        int allowed = 0;
        int denied = 0;

        for (String[] attempt : attempts) {
            if (attempt != null && attempt.length >= 2) {
                String result = classifyAccess(attempt[0], attempt[1]);
                if (result.equals("ALLOWED")) {
                    allowed++;
                } else {
                    denied++;
                }
            }
        }
        return String.format("Allowed: %d | Denied: %d", allowed, denied);
    }

    public static void main(String[] args) {
        System.out.println("=== Movie Ticket Field Visibility & Subclass Access Checker ===");
        System.out.println("private in SAME_CLASS: " + classifyAccess("private", "SAME_CLASS"));
        System.out.println("protected in DIFFERENT_PACKAGE: " + classifyAccess("protected", "DIFFERENT_PACKAGE"));
        System.out.println("protected in SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE: " + classifyAccess("protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"));
        System.out.println("protected in SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE: " + classifyAccess("protected", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"));

        String[][] batch = {
            {"default", "SAME_PACKAGE"},
            {"default", "DIFFERENT_PACKAGE"},
            {"public", "DIFFERENT_PACKAGE"}
        };
        System.out.println("Batch Summary: " + summarizeBatch(batch));
    }
}
