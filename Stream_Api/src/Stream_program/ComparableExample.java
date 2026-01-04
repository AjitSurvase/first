package Stream_program;

import java.util.Arrays;
import java.util.List;

// Non-public class
class Employee6 implements Comparable<Employee6> {

    int id;
    String name;

    Employee6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural ordering by id
    @Override
    public int compareTo(Employee6 e) {
        return this.id - e.id;   // ascending order
    }
}

// Another non-public class
class Manager {
    String department;

    Manager(String department) {
        this.department = department;
    }
}

// Only ONE public class
public class ComparableExample {

    public static void main(String[] args) {

        List<Employee6> list = Arrays.asList(
                new Employee6(3, "Ajit"),
                new Employee6(1, "Rahul"),
                new Employee6(2, "Neha")
        );

        System.out.println("Before Sorting:");
        list.forEach(e ->
                System.out.println(e.id + " - " + e.name)
        );

        System.out.println("\nAfter Sorting (using Comparable):");
        list.stream()
            .sorted()
            .forEach(e ->
                System.out.println(e.id + " - " + e.name)
            );

        // Using second class in same file
        Manager m = new Manager("IT");
        System.out.println("\nManager Department: " + m.department);
    }
}
