
package Assignment1;

import java.time.Duration;
import java.time.LocalTime;

public class task8 {

    static interface Chargeable {
        double chargingFee(int kWh);
    }

    static abstract class Vehicle {
        private final String regNo;

        Vehicle(String regNo) {
            this.regNo = regNo;
        }

        String getRegNo() {
            return regNo;
        }

        abstract double ratePerHour();

        double calculateFee(int minutes) {
            int hours = (minutes + 59) / 60;
            return hours * ratePerHour();
        }

        double calculateFee(LocalTime in, LocalTime out) {
            int minutes = (int) Duration.between(in, out).toMinutes();
            return calculateFee(minutes);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + " " + regNo;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Vehicle) {
                Vehicle other = (Vehicle) obj;
                return regNo.equals(other.regNo);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return regNo.hashCode();
        }
    }

    static class TwoWheeler extends Vehicle {
        TwoWheeler(String regNo) {
            super(regNo);
        }

        @Override
        double ratePerHour() {
            return 10;
        }
    }

    static class Car extends Vehicle {
        Car(String regNo) {
            super(regNo);
        }

        @Override
        double ratePerHour() {
            return 30;
        }
    }

    static class ElectricCar extends Car implements Chargeable {
        ElectricCar(String regNo) {
            super(regNo);
        }

        @Override
        public double chargingFee(int kWh) {
            return kWh * 12;
        }
    }

    public static void main(String[] args) {
        Vehicle[] parked = {
            new TwoWheeler("TN01A1"),
            new Car("TN02B2"),
            new ElectricCar("TN03C3")
        };

        for (Vehicle v : parked) {
            double fee = v.calculateFee(130);

            if (v instanceof Chargeable) {
                Chargeable c = (Chargeable) v;
                fee += c.chargingFee(10);
            }

            System.out.println(v + " -> Rs " + fee);
        }

        System.out.println(
            new Car("TN02B2").equals(new ElectricCar("TN02B2"))
        );
    }
}
