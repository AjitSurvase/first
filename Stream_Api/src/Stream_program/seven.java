package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seven {
	
	public static void main(String[] args) {
		
//		Example 1: Convert String to Uppercase
		
		List<String> names = Arrays.asList("ajit", "shivam", "mahesh");
		
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("******************");
		
//		🔹 Example 2: Convert Integer to Square
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		nums.stream()
		.map(n->n*n)
		.forEach(System.out::println);
		
		System.out.println("******************");
		
		
	// Example 3: map() with collect()
		
		// output in list 
		
		List<String> upper =
			    names.stream()
			         .map(String::toUpperCase)
			         .collect(Collectors.toList());

			System.out.println(upper);
		
//			forEach → Do something
//			collect → Get something
		
			
//			orEach() is used to perform an action on each element of the stream and does not return any value.
//			collect() is used to transform the stream into a collection like List, Set, or Map and returns the result.

	}

}
