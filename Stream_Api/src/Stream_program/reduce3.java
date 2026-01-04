package Stream_program;

import java.util.Arrays;
import java.util.List;

public class reduce3 {
	
	public static void main(String[] args) {
		
//		Example: Combine strings
		List<String> names = Arrays.asList(" Java", " Stream", "API");
		
		
		String result=names.stream()
				.reduce("", (a,b)->a+" "+b );   //identity:""
		
		System.out.println(result.trim());   //trim: removes the extra space.
		

		
	}

}
