package Stream_program;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
	
	public static void main(String[] args) {
		
//		3️: noneMatch()
//		Returns true if NO element matches the condition.
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		boolean result=nums.stream()
				.noneMatch(n->n>4);
		
		System.out.println(result);//true
		
		 
		 System.out.println("********************");
		 
		 
		List<Integer> nums1 = Arrays.asList(1, -2, 3);

		boolean result1 =
		        nums1.stream()
		            .noneMatch(n -> n < 0);

		System.out.println(result1);//false
		
		
		
		/*
		 Empty Stream Behavior (VERY IMPORTANT )
		List<Integer> numsss = new ArrayList<>();

		Method	Result
		
		anyMatch	false
		allMatch	true
		noneMatch	true

		 Because:

		“All elements match” is vacuously true

		“None match” is also true
*/
	}

}
