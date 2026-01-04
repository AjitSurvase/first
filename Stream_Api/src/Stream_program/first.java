package Stream_program;

import java.util.Arrays;
import java.util.List;

//program for remove duplicate element from list .
//using stream 
public class first {
    
	public static void main(String[] args) {
		
		List<Integer>num=Arrays.asList(10,20,20,30,40);
		
		num.stream().distinct().forEach(System.out::println);
		
		
	}
	
	
}


