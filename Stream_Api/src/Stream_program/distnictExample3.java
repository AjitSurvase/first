package Stream_program;
import java.util.*;
import java.util.stream.Collectors;

public class distnictExample3{

    public static void main(String[] args) {

        // Creating Employee list with duplicates
        List<Employee> list = Arrays.asList(
                new Employee(1, "Ajit"),
                new Employee(1, "Ajit"),
                new Employee(2, "Shivam"),
                new Employee(2, "Shivam"),
                new Employee(3, "Mahesh")
        );

        System.out.println("===== Using distinct() =====");
        list.stream()
            .distinct()
            .forEach(e -> System.out.println(e.id + " " + e.name));

        System.out.println("\n===== Without distinct() (using Collectors.toMap) =====");
        list.stream()
            .collect(Collectors.toMap(
                    e -> e.id,      // key
                    e -> e,         // value
                    (e1, e2) -> e1  // merge logic (keep first)
            ))
            .values()
            .forEach(e -> System.out.println(e.id + " " + e.name));
    }
}

// Employee class
class Employee3 {
    int id;
    String name;

    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // VERY IMPORTANT for distinct()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return id == e.id && Objects.equals(name, e.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
