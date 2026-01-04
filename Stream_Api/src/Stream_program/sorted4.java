package Stream_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee4 {
    int id;
    String name;
    double salary;

    Employee4(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class sorted4 {

    public static void main(String[] args) {

        List<Employee4> list = Arrays.asList(
                new Employee4(3, "Mahesh", 40000),
                new Employee4(1, "Ajit", 50000),
                new Employee4(2, "Shivam", 45000)
        );

        System.out.println("---- Sort by ID (Ascending) ----");
        list.stream()
            .sorted(Comparator.comparing(e -> e.id))
            .forEach(e ->
                System.out.println(e.id + " " + e.name + " " + e.salary)
            );

        System.out.println("\n---- Sort by Name (Ascending) ----");
        list.stream()
            .sorted(Comparator.comparing(e -> e.name))
            .forEach(e ->
                System.out.println(e.id + " " + e.name + " " + e.salary)
            );

        System.out.println("\n---- Sort by Salary (Ascending) ----");
        list.stream()
            .sorted(Comparator.comparing(e -> e.salary))
            .forEach(e ->
                System.out.println(e.id + " " + e.name + " " + e.salary)
            );

        
        

        
    }
}
