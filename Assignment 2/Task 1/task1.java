
package Assignment2;

public class task1 {

    public static void main(String[] args) {

        int tickets = 1000;
        int fields = 50;

        long start, end;

        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            String ticket = "";

            for (int j = 0; j < fields; j++) {
                ticket = ticket + "Field" + j + " ";
            }
        }

        end = System.nanoTime();
        System.out.println("String Time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            StringBuilder ticket = new StringBuilder();

            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }

        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            StringBuffer ticket = new StringBuffer();

            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }

        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) + " ns");

        StringBuilder sample = new StringBuilder();
        sample.append("PNR: 12345\n");
        sample.append("Name: Arun\n");
        sample.append("Coach: A1\n");
        sample.append("Berth: 25\n");
        sample.append("Fare: 500");

        System.out.println("\nSample Ticket:");
        System.out.println(sample);
    }
}
