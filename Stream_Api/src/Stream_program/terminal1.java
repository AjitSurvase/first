package Stream_program;

import java.util.Arrays;
import java.util.List;

public class terminal1 {
	
	public static void main(String[] args) {
		   
		   
//		Example 1: Basic forEach()
		List<String> names = Arrays.asList("Ajit", "Shivam", "Mahesh");

        names.stream()
             .forEach(System.out::println);
        
        
        System.out.println("********************");
        
        
//        Example 2: forEach() with Lambda
        
        
        names.stream()
       .forEach(name-> System.out.println(name.toUpperCase()));
		
	}

}
