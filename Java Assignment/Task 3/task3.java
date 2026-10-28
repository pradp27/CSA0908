package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of floors: ");
        int floors = sc.nextInt();

        int[] sizes = new int[floors];

        for (int i = 0; i < floors; i++) {
            System.out.print("Enter slots on floor " + i + ": ");
            sizes[i] = sc.nextInt();
        }

        String[][] slots = new String[floors][];

        for (int i = 0; i < floors; i++) {
            slots[i] = new String[sizes[i]];
        }

        int choice = 0;

        while (choice != 3) {
            System.out.println("1. Park vehicle");
            System.out.println("2. Release slot");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter vehicle number: ");
                String regNo = sc.nextLine();
                boolean found = false;

                for (int f = 0; f < floors && !found; f++) {
                    for (int s = 0; s < slots[f].length; s++) {
                        if (slots[f][s] == null) {
                            slots[f][s] = regNo;
                            System.out.println(Arrays.toString(new int[]{f, s}));
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    System.out.println("Parking full");
                }
            } else if (choice == 2) {
                System.out.print("Enter floor number: ");
                int f = sc.nextInt();

                System.out.print("Enter slot number: ");
                int s = sc.nextInt();

                if (f >= 0 && f < floors && s >= 0 &&
                    s < slots[f].length && slots[f][s] != null) {
                    slots[f][s] = null;
                    System.out.println("Slot released");
                } else {
                    System.out.println("Invalid or empty slot");
                }
            }
        }

        sc.close();
    }
}