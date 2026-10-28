
package Assignment1;

import java.util.HashMap;
import java.util.Map;

class ParkingSystem {
    private Map<String, Double> parked = new HashMap<>();
    private double totalCollection = 0;

    public void enter(String vehicleNo, double hourlyRate) {
        if (vehicleNo == null || vehicleNo.trim().isEmpty()) {
            System.out.println("Invalid vehicle number");
        } else if (parked.containsKey(vehicleNo)) {
            System.out.println("Vehicle already parked");
        } else {
            parked.put(vehicleNo, hourlyRate);
            System.out.println(vehicleNo + " entered");
        }
    }

    public void exit(String vehicleNo, int minutes) {
        if (!parked.containsKey(vehicleNo)) {
            System.out.println("Vehicle not found");
            return;
        }

        double rate = parked.remove(vehicleNo);
        int hours = (minutes + 59) / 60;
        double fee = hours * rate;

        totalCollection += fee;
        System.out.println(vehicleNo + " fee: Rs " + fee);
    }

    public double getTotalCollection() {
        return totalCollection;
    }
}

public class task11 {
    public static void main(String[] args) {
        ParkingSystem p = new ParkingSystem();

        p.enter("TN01A1", 10);
        p.enter("TN02B2", 30);
        p.enter("TN01A1", 10);

        p.exit("TN01A1", 60);
        p.exit("TN02B2", 120);
        p.exit("TN03C3", 30);

        System.out.println("Total Collection: Rs " + p.getTotalCollection());
    }
}
