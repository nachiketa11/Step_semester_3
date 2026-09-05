package week4_constructors_and_access_modifiers.assigment_problems;

class VehicleParking {
    protected String vehicleNumber;
    protected int overstayHours;

    public VehicleParking(String vehicleNumber, int overstayHours) {
        this.vehicleNumber = vehicleNumber;
        this.overstayHours = overstayHours;
    }

    // final method ensures fine calculation formula cannot be overridden
    public final double calculateFine() {
        if (overstayHours <= 0) return 0.0;
        return overstayHours * 100.0; // Rs 100 per overstay hour
    }

    public void displayFineReport() {
        System.out.printf("Vehicle: %-10s | Overstay: %d hrs | Fine: Rs %.2f%n",
                vehicleNumber, overstayHours, calculateFine());
    }
}

public class ParkingFineCalculator {

    public static void main(String[] args) {
        System.out.println("=== Parking Overstay Fine Calculator (final method) ===");
        VehicleParking v1 = new VehicleParking("KA-01-1234", 3);
        VehicleParking v2 = new VehicleParking("MH-12-5678", 0);
        VehicleParking v3 = new VehicleParking("DL-03-9999", 5);

        v1.displayFineReport();
        v2.displayFineReport();
        v3.displayFineReport();
    }
}
