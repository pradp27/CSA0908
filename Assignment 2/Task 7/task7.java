
package Assignment2;

public class task7 {

    public static void main(String[] args) {

        int fields = 10000;

        long start, end;

        start = System.nanoTime();

        String oldTicket = "";

        for (int i = 0; i < fields; i++) {
            oldTicket = oldTicket + "Field" + i + " ";
        }

        end = System.nanoTime();

        long oldTime = end - start;

        System.out.println("Original String Time: " + oldTime + " ns");

        start = System.nanoTime();

        StringBuilder newTicket = new StringBuilder();

        for (int i = 0; i < fields; i++) {
            newTicket.append("Field").append(i).append(" ");
        }

        end = System.nanoTime();

        long newTime = end - start;

        System.out.println("Redesigned StringBuilder Time: " + newTime + " ns");

        System.out.println("\nSample Ticket:");

        StringBuilder sample = new StringBuilder();

        sample.append("PNR: 12345\n");
        sample.append("Passenger: Arun\n");
        sample.append("Coach: A1\n");
        sample.append("Berth: 25\n");
        sample.append("Fare: 500");

        System.out.println(sample);

        System.out.println("\nPerformance Comparison:");

        if (oldTime > newTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("String was faster in this run.");
        }
    }
}
