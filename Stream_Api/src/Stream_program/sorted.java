package Stream_program;

import java.util.Arrays;
import java.util.List;

public class sorted {
	
	public static void main(String[] args) {
		
//		Example 1: Sorting Integers

		        List<Integer> nums = Arrays.asList(5, 1, 3, 2, 4);

		        nums.stream()
		            .sorted()
		            .forEach(System.out::println);
		    }
		

		
	}


