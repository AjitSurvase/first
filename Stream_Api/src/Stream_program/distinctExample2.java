package Stream_program;

import java.util.Arrays;
import java.util.List;

public class distinctExample2 {
	
	public static void main(String[] args) {
		
		
//		🔹 Example 3: DISTINCT DOES NOT SORT ❗
		
		List<Integer> nums = Arrays.asList(3, 1, 2, 1, 3);

		nums.stream()
		    .distinct()
		    .forEach(System.out::println);

		System.out.println("**********************");
		
//		 Example 4: distinct() + sorted()
		
		nums.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		
	}

}
