package Stream_program;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
	
	public static void main(String[] args) {
//	     2️ allMatch()
//		
//
//		 Returns true if ALL elements match the condition.
		
//		Example 2: All elements positive?
		List<Integer> nums = Arrays.asList(2, 4, 6, 8);
		
		 boolean result=nums.stream()
				 .allMatch(n->n%2==0);
		 
		 
		 System.out.println(result);
		 
		 
		 System.out.println("********************");
		 
		 
		 
//		  Failure Example
		 List<Integer> nums1 = Arrays.asList(2, 4, 5, 8);

		 boolean result1 =
		         nums1.stream()
		             .allMatch(n -> n % 2 == 0);

		 System.out.println(result1);
		
		
	}

}
