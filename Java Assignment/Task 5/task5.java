package Assignment1;
import java.util.Scanner;

class Ticket {
    static int count = 100;
    int ticketNo;

    Ticket() {
        count++;
        ticketNo = count;
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
    }
}

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Ticket t = new Ticket();
            t.display();
        }

        System.out.println("Total tickets: " + (Ticket.count - 100));

        sc.close();
    }
}