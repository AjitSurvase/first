package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirst1 {
//	        What does findFirst() do?
//
//			 Returns the FIRST element of the stream
//			 Order matters
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 30, 40);
		
		Optional<Integer>result=nums.stream()
				.findFirst();
		
		System.out.println(result);
		
		
		
//		Example 2: With filter
		
		List<Integer> nums1 = Arrays.asList(1, 3, 5, 8,6);
		Optional<Integer>result1=nums1.stream()
				.filter(n->n%2==0)
				.findFirst();
		
		System.out.println(result1);
		
	}

}
