package Stream_program;

import java.util.Arrays;
import java.util.List;

// Employee class
class Employee7 {
    int id;
    String name;

    Employee7(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class
public class limit2 {

    public static void main(String[] args) {

        List<Employee7> list = Arrays.asList(
                new Employee7(1, "Ajit"),
                new Employee7(2, "Shivam"),
                new Employee7(3, "Mahesh"),
                new Employee7(4, "Ravi")
        );

        list.stream()
            .skip(1)
            .limit(2)
            .forEach(e -> System.out.println(e.id + " " + e.name));
    }
}
