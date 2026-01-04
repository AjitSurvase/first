package Stream_program;

import java.util.Arrays;
import java.util.List;

public class third {
	
	   
	public static void main(String[] args) {
		
		List<Integer>number=Arrays.asList(1, 2, 3, 4, 5);
		
	
		number.stream()
	    .filter(n -> n % 2 == 0)
	    .forEach(System.out::println);
		
		
	}

	

}
