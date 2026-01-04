package Stream_program;

import java.util.Arrays;
import java.util.List;

public class flatmap2 {
	
	public static void main(String[] args) {
		
//		 Example 3: Remove Duplicates After flatMap
		
		List<List<Integer>> nums = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(2, 3)
			);
		
		
		nums.stream()
		.flatMap(i->i.stream())
		.distinct()
		.forEach(System.out::println);
		
//		
//	   Question:
//
//		Why can’t map() be used instead of flatMap()?
//
//	     Answer:
//
//		map() preserves nesting and produces a stream of streams, whereas flatMap() flattens nested streams into a single stream.
		
		
		
		
	}

}
