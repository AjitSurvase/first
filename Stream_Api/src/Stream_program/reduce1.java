package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduce1 {
	
	public static void main(String[] args) {
		
//		Example: Sum of numbers
		List<Integer>nums=Arrays.asList(1,2,3,4,5);
		
		 Optional<Integer>result=nums.stream()
		.reduce((a,b)->a+b);
//		 reduce() returns Optional because the stream may be empty, and there may be no result to return.
		
		System.out.println(result);
		

//		Why return type is Optional?
//		Because the stream might be empty.
		
	}

}
