package Stream_program;

import java.util.Arrays;
import java.util.List;

public class Employee {

    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Ajit"),
                new Employee(2, "Shivam")
        );

        list.stream()
            .map(e -> e.name)
            .forEach(System.out::println);
    }
}
