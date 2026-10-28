package Assignment1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] slots = new String[2][3];

        System.out.print("Enter floor number: ");
        int floor = sc.nextInt();

        System.out.print("Enter slot number: ");
        int slot = sc.nextInt();
        sc.nextLine();

        if (floor >= 0 && floor < slots.length &&
            slot >= 0 && slot < slots[floor].length) {
            System.out.print("Enter vehicle number: ");
            String regNo = sc.nextLine();

            if (slots[floor][slot] == null) {
                slots[floor][slot] = regNo;
                System.out.println("Slot allocated");
            } else {
                System.out.println("Slot occupied");
            }
        } else {
            System.out.println("Invalid slot");
        }

        sc.close();
    }
}