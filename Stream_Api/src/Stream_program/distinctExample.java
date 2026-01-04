package Stream_program;

import java.util.Arrays;
import java.util.List;

//distinct() works based on equals() and hashCode()
//
//If these two are not properly implemented,
//👉 distinct() WILL NOT WORK CORRECTLY.



public class distinctExample {
	
	public static void main(String[] args) {
		
//		Example 1: Primitive Wrapper (Integer)
		
		List<Integer> numbers=Arrays.asList(10,20,30,20,40,30,50,60);
		
		numbers.stream()
		.distinct()
		.forEach(System.out::println);
	}

	
	
//	Integer already overrides equals() and hashCode().
}
