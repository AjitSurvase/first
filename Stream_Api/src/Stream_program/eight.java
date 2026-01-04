package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class eight {
	
	public static void main(String[] args) {
		
		// Example 1: Even Numbers
		
		List<Integer> nums = Arrays.asList(10, 15, 20, 25);
		
		nums.stream()
		.filter((i)->(i%2==0))
		.forEach(System.out::println);
		
		
		System.out.println("*************");
		
		
		// Example 2: Strings Length > 5
		
		
		List<String> names = Arrays.asList("Ajit", "Shivam", "Mahesh");
		
		names.stream()
		.filter(n->n.length()>5)
		.forEach(System.out::println);
		
		
		System.out.println("******************");
		
		
		//🔹 filter() Uses Predicate
		Predicate<Integer> p = n -> n > 10;
		nums.stream().filter(p).forEach(System.out::println);

		
		
	}

}
