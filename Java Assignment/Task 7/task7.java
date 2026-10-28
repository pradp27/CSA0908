
package Assignment1;

import java.util.Scanner;

public class task7 {

    static class Vehicle {
        String regNo;

        Vehicle(String regNo) {
            this.regNo = regNo;
        }

        int calculateFee() {
            return 0;
        }

        public String toString() {
            return "Vehicle Number: " + regNo;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Vehicle) {
                Vehicle v = (Vehicle) obj;
                return regNo.equals(v.regNo);
            }
            return false;
        }

        public int hashCode() {
            return regNo.hashCode();
        }
    }

    static class Car extends Vehicle {
        Car(String regNo) {
            super(regNo);
        }

        @Override
        int calculateFee() {
            return 30;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first vehicle number: ");
        String first = sc.nextLine();

        System.out.print("Enter second vehicle number: ");
        String second = sc.nextLine();

        Vehicle c1 = new Car(first);
        Vehicle c2 = new Car(second);

        System.out.println(c1);
        System.out.println("Parking Fee: " + c1.calculateFee());
        System.out.println("Both vehicles are equal: " + c1.equals(c2));

        sc.close();
    }
}
