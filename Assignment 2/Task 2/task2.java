
package Assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class task2 {

    public static void main(String[] args) {

        int size = 10000;

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        long start, end;

        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.add("Song" + i);
        }

        end = System.nanoTime();
        System.out.println("ArrayList Add Time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.add("Song" + i);
        }

        end = System.nanoTime();
        System.out.println("LinkedList Add Time: " + (end - start) + " ns");

        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayDeque.addLast("Song" + i);
        }

        end = System.nanoTime();
        System.out.println("ArrayDeque Add Time: " + (end - start) + " ns");

        start = System.nanoTime();

        System.out.println("\nArrayList Kth Song: " + arrayList.get(5000));

        end = System.nanoTime();
        System.out.println("ArrayList Access Time: " + (end - start) + " ns");

        start = System.nanoTime();

        System.out.println("LinkedList Kth Song: " + linkedList.get(5000));

        end = System.nanoTime();
        System.out.println("LinkedList Access Time: " + (end - start) + " ns");

        start = System.nanoTime();

        int count = 0;
        for (String song : arrayDeque) {
            count++;
        }

        end = System.nanoTime();
        System.out.println("ArrayDeque Iteration Time: " + (end - start) + " ns");

        arrayDeque.addFirst("New Song");
        arrayDeque.addLast("Last Song");

        System.out.println("\nFirst Song: " + arrayDeque.peekFirst());
        System.out.println("Last Song: " + arrayDeque.peekLast());

        System.out.println("\nCollection sizes:");
        System.out.println("ArrayList: " + arrayList.size());
        System.out.println("LinkedList: " + linkedList.size());
        System.out.println("ArrayDeque: " + arrayDeque.size());
    }
}
