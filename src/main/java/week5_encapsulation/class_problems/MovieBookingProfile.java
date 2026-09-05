package week5_encapsulation.class_problems;

public class MovieBookingProfile {

    private String name;
    private boolean confirmed;
    private String otp; // write-only property

    // Public no-argument constructor
    public MovieBookingProfile() {
        this.name = "";
        this.confirmed = false;
        this.otp = null;
    }

    // Convenience constructor chaining to this()
    public MovieBookingProfile(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    // Write-only property: setter exists, NO getter exists anywhere
    public void setOtp(String otp) {
        this.otp = otp;
    }

    public static void main(String[] args) {
        System.out.println("=== MovieBookingProfile JavaBean & OTP Property ===");
        MovieBookingProfile p1 = new MovieBookingProfile("Rahul Dev");
        System.out.println("Name: " + p1.getName());

        p1.setConfirmed(true);
        System.out.println("Is Confirmed: " + p1.isConfirmed());

        p1.setOtp("4471");
        System.out.println("OTP set successfully (write-only property, no getter exists).");
    }
}
