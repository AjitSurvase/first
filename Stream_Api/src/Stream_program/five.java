package Stream_program;

import java.util.Arrays;
import java.util.List;

public class five {
	
	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("Ajit","Shivam","mahesh");
		
		  
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
//		
//		
//
//		names.stream()                 // Source
//		     .filter(n -> n.length() > 5) // Intermediate
//		     .map(String::toUpperCase)    // Intermediate
//		     .forEach(System.out::println); // Terminal

		
	}

}
