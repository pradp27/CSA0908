package Assignment1;
import java.util.Scanner;

class ParkingTicket {
    int ticketNo;
    String regNo;

    ParkingTicket() {
        ticketNo = 0;
        regNo = "Not Assigned";
    }

    ParkingTicket(int ticketNo, String regNo) {
        this.ticketNo = ticketNo;
        this.regNo = regNo;
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Vehicle Number: " + regNo);
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter vehicle number: ");
        String regNo = sc.nextLine();

        ParkingTicket ticket = new ParkingTicket(number, regNo);
        ticket.display();

        sc.close();
    }
}