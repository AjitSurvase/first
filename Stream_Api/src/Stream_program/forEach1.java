package Stream_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach1 {
	
	public static void main(String[] args) {
		
//		Example 3: forEach() with Side Effects ⚠️
		List<Integer> result = new ArrayList<>();

		List<Integer> nums = Arrays.asList(1, 2, 3);

		nums.stream()
		    .forEach(n -> result.add(n * 2));

		System.out.println(result);

		
		
//		 Example : forEach() After map & filter
		
		List<Integer> nums1 = Arrays.asList(10, 15, 20, 25);

		nums1.stream()
		    .filter(n -> n > 15)
		    .map(n -> n * 2)
		    .forEach(System.out::println);

		
	}

}
