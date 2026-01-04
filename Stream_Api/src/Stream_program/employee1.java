package Stream_program;


import java.util.Arrays;
import java.util.List;

public class employee1 {
	
	// Filter Objects using Stream

	    int id;
	    String name;

	    // Constructor
	    employee1(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public static void main(String[] args) {

	        List<employee1> list = Arrays.asList(
	                new employee1(1, "Ajit"),
	                new employee1(2, "Shivam"),
	                new employee1(3, "Mahesh")
	        );

	        list.stream()
	            .filter(e -> e.id > 1)
	            .map(e -> e.name)
	            .forEach(System.out::println);
	    }
	}



