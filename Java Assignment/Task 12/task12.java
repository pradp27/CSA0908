
package Assignment1;

public class task12 {

    static class Vehicle {
        String regNo;

        Vehicle(String regNo) {
            this.regNo = regNo;
        }

        double calculateFee(int hours) {
            return hours * 30;
        }
    }

    static class Car extends Vehicle {
        Car(String regNo) {
            super(regNo);
        }
    }

    static class ElectricBike extends Vehicle {
        ElectricBike(String regNo) {
            super(regNo);
        }

        @Override
        double calculateFee(int hours) {
            return 20;
        }
    }

    static class DeliveryVan extends Vehicle {
        DeliveryVan(String regNo) {
            super(regNo);
        }

        double calculateFee(int hours, int entryTime) {
            if (entryTime >= 9 && entryTime < 17) {
                return hours * 60;
            }
            return hours * 30;
        }
    }

    static class VisitorPass {
        String regNo;

        VisitorPass(String regNo) {
            this.regNo = regNo;
        }

        double calculateFee() {
            return 100;
        }
    }

    public static void main(String[] args) {

        Car car = new Car("TN01A1");
        ElectricBike bike = new ElectricBike("TN02B2");
        DeliveryVan van = new DeliveryVan("TN03C3");
        VisitorPass visitor = new VisitorPass("TN04D4");

        System.out.println("Car Fee: Rs " + car.calculateFee(3));
        System.out.println("Electric Bike Fee: Rs " + bike.calculateFee(3));
        System.out.println("Delivery Van Fee: Rs " + van.calculateFee(3, 10));
        System.out.println("Visitor Pass Fee: Rs " + visitor.calculateFee());

    }
}
