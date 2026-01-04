package Stream_program;

import java.util.Arrays;
import java.util.List;

public class limit {
	public static void main(String[] args) {
		
//		 Example 1: limit() Only
//		index start from 1;
		
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
		
		nums.stream()
		.limit(3).
		forEach(System.out::println);
		
		System.out.println("*********************");
//		 Example 2: skip() Only
		
		 nums.stream()
		.skip(2)
		.forEach(System.out::println);
		
		 
		 
//		  Example 3: skip() + limit() (Pagination)
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
