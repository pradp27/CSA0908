package Assignment1;

public class task9 {

    static abstract class Vehicle {
        String regNo;

        Vehicle(String regNo) {
            this.regNo = regNo;
        }

        abstract double calculateFee();
    }

    static class TwoWheeler extends Vehicle {
        TwoWheeler(String regNo) {
            super(regNo);
        }

        @Override
        double calculateFee() {
            return 30;
        }
    }

    static class Car extends Vehicle {
        Car(String regNo) {
            super(regNo);
        }

        @Override
        double calculateFee() {
            return 90;
        }
    }

    static class ElectricCar extends Vehicle {
        ElectricCar(String regNo) {
            super(regNo);
        }

        @Override
        double calculateFee() {
            return 210;
        }
    }

    public static void main(String[] args) {

        Vehicle v1 = new TwoWheeler("TN01A1");
        Vehicle v2 = new Car("TN02B2");
        Vehicle v3 = new ElectricCar("TN03C3");

        System.out.println(v1.regNo + " -> Rs " + v1.calculateFee());
        System.out.println(v2.regNo + " -> Rs " + v2.calculateFee());
        System.out.println(v3.regNo + " -> Rs " + v3.calculateFee());
    }
}