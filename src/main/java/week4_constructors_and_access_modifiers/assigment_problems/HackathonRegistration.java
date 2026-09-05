package week4_constructors_and_access_modifiers.assigment_problems;

public class HackathonRegistration {

    private String participantName;
    private String teamName;
    private String track;

    // Overloaded constructors with this() chaining
    public HackathonRegistration(String participantName) {
        this(participantName, "Solo", "General");
    }

    public HackathonRegistration(String participantName, String teamName) {
        this(participantName, teamName, "General");
    }

    public HackathonRegistration(String participantName, String teamName, String track) {
        this.participantName = participantName;
        this.teamName = teamName;
        this.track = track;
    }

    public void displayRegistration() {
        System.out.printf("Participant: %-12s | Team: %-12s | Track: %s%n",
                participantName, teamName, track);
    }

    public static void main(String[] args) {
        System.out.println("=== Overloaded Constructors for Hackathon Registration ===");
        HackathonRegistration p1 = new HackathonRegistration("Alex");
        HackathonRegistration p2 = new HackathonRegistration("Rohan", "ByteBusters");
        HackathonRegistration p3 = new HackathonRegistration("Meera", "CyberKnights", "AI/ML");

        p1.displayRegistration();
        p2.displayRegistration();
        p3.displayRegistration();
    }
}
