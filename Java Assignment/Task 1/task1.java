package Assignment1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = sc.nextLine();

        System.out.println("Vehicle Number: " + regNo);
        System.out.println("Vehicle Type: " + type);

        sc.close();
    }
}