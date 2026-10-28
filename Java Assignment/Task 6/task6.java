package Assignment1;
import java.util.Scanner;

class Vehicle {
    String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    void display() {
        System.out.println("Vehicle Number: " + regNo);
    }
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    void showType() {
        System.out.println("Vehicle Type: Car");
    }
}

class ElectricCar extends Car {
    ElectricCar(String regNo) {
        super(regNo);
    }

    void charge() {
        System.out.println("Electric Car Charging");
    }
}

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String regNo = sc.nextLine();

        ElectricCar car = new ElectricCar(regNo);
        car.display();
        car.showType();
        car.charge();

        sc.close();
    }
}