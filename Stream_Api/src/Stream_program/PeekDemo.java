package Stream_program;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {
	//peek
	
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3);
		
		 nums.stream()
         .peek(n -> System.out.println("Before map: " + n))
         .map(n -> n * 2)
         .peek(n -> System.out.println("After map: " + n))
         .forEach(System.out::println);
		
		 
		 
//		output
		 
		/* 
		 Before map: 1
		 After map: 2
		 2
		 Before map: 2
		 After map: 4
		 4
		 Before map: 3
		 After map: 6
		 6
		 */

	}

}
