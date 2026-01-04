package Stream_program;

import java.util.Arrays;
import java.util.List;


// CONCEPT 4: Lazy Evaluation
public class six {
	
	public static void main(String[] args) {
		
//		Stream operations run only when needed.
		List<Integer> nums = Arrays.asList(1, 2, 3);
		
		nums.stream()
		.filter(n->{
			System.out.println("filterning :"+n);
			
			return n>1;
		});
		
//		(no output)
		
		System.out.println("***************");    
		
		
		
		nums.stream()
		.filter(n->{
			System.out.println("filterning :"+n);
			return n>1;
		})
		.forEach(System.out::println);
		
//		Intermediate operations are lazy and executed only when a terminal operation is called.
		
		
		
	}

}
