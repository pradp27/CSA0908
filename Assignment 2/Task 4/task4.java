
package Assignment2;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task4 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(103, "Paracetamol");
        hashMap.put(101, "Aspirin");
        hashMap.put(102, "Cetirizine");

        treeMap.put(103, "Paracetamol");
        treeMap.put(101, "Aspirin");
        treeMap.put(102, "Cetirizine");

        linkedHashMap.put(103, "Paracetamol");
        linkedHashMap.put(101, "Aspirin");
        linkedHashMap.put(102, "Cetirizine");

        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nTreeMap:");
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<Integer, String> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nMedicine Lookup:");

        int code = 102;

        System.out.println("Medicine: " + hashMap.get(code));
    }
}
