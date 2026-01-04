package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FinadAny1 {
	
	public static void main(String[] args) {
		
//		Example 1: Sequential Stream
		List<Integer> nums = Arrays.asList(1, 3, 5, 8,6);
		
		Optional<Integer> result =
		        nums.stream()
		            .findAny();
 
		System.out.println(result.get());
		
		
//		Example 2: Parallel Stream (IMPORTANT )
		
		Optional<Integer> result1 =
		        nums.parallelStream()
		            .findAny();

		System.out.println(result1.get());

//		findAny() is optimized for parallel streams and may return any element without preserving order.
	}

}
