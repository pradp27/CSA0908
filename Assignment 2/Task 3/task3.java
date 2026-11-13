
package Assignment2;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

class Student {

    String regNo;
    String name;

    Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student s = (Student) o;

        return regNo.equals(s.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }

    @Override
    public String toString() {
        return regNo + " " + name;
    }
}

public class task3 {

    public static void main(String[] args) {

        Set<Student> present = new HashSet<>();

        present.add(new Student("192311001", "Arun"));
        present.add(new Student("192311002", "Divya"));
        present.add(new Student("192311001", "Arun"));

        System.out.println("Unique students: " + present.size());

        System.out.println("\nStudent Details:");

        for (Student s : present) {
            System.out.println(s);
        }

        System.out.println("\nDuplicate Test:");

        Student s1 = new Student("192311003", "Kumar");
        Student s2 = new Student("192311003", "Kumar");

        System.out.println("Are students equal? " + s1.equals(s2));
    }
}
