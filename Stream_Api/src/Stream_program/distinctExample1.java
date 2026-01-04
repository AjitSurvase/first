package Stream_program;

import java.util.Arrays;
import java.util.List;

public class distinctExample1 {
	
	
//	🔹 Example 2: String Duplicate Removal
	
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ajit", "Shivam", "Ajit", "Mahesh");

		names.stream()
		     .distinct()
		     .forEach(System.out::println);

		
		
	}

}
