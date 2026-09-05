package week5_encapsulation.assigment_problems;

class LibraryMember {
    private String membershipPin;
    String branchCode; // default
    protected String memberTier;
    public String fullName;

    public LibraryMember(String membershipPin, String branchCode, String memberTier, String fullName) {
        this.membershipPin = membershipPin;
        this.branchCode = branchCode;
        this.memberTier = memberTier;
        this.fullName = fullName;
    }

    public String getMembershipPin() {
        return membershipPin;
    }
}

public class MembershipAccessChecker {

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
                    return "DENIED";
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
        System.out.println("=== Membership Field Reach & Subclass Access Checker ===");
        System.out.println("private in SAME_CLASS: " + classifyAccess("private", "SAME_CLASS"));
        System.out.println("protected in SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE: " + classifyAccess("protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"));
        System.out.println("protected in SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE: " + classifyAccess("protected", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"));
    }
}
