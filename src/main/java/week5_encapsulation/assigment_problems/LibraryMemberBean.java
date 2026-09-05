package week5_encapsulation.assigment_problems;

public class LibraryMemberBean {

    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer; // write-only

    // Public no-argument constructor
    public LibraryMemberBean() {
        this.membershipId = null;
        this.name = "";
        this.premiumMember = false;
        this.securityAnswer = null;
    }

    public String getMembershipId() {
        return membershipId;
    }

    // Write-once property: setMembershipId takes effect ONLY on its first call
    public void setMembershipId(String membershipId) {
        if (this.membershipId == null) {
            this.membershipId = membershipId;
        }
        // subsequent calls are silently ignored
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        this.premiumMember = premiumMember;
    }

    // Write-only property: stores one-way transformed value, NO getter exists
    public void setSecurityAnswer(String securityAnswer) {
        if (securityAnswer != null) {
            this.securityAnswer = "HASHED_" + securityAnswer.hashCode();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== LibraryMember JavaBean & Security Answer Property ===");
        LibraryMemberBean m = new LibraryMemberBean();
        m.setMembershipId("LIB-8841");
        m.setName("Priya Nair");
        m.setPremiumMember(true);

        System.out.println("Initial Membership ID: " + m.getMembershipId());

        m.setMembershipId("FAKE-0000"); // 2nd call (ignored)
        System.out.println("Membership ID after second set call: " + m.getMembershipId()); // "LIB-8841"

        System.out.println("Is Premium Member: " + m.isPremiumMember());

        m.setSecurityAnswer("BlueMountain");
        System.out.println("Security answer set (write-only property, no getter exists).");
    }
}
