package Stream_program;

import java.util.Arrays;
import java.util.List;

public class fourth {
	public static void main(String[] args) {
		   
		//Collections hold data, Streams process data.
		//Collection Example:
		
		List<String>names=Arrays.asList("Ajit","Shivam","mahesh");
		
		System.out.println(names.get(0));
		
		System.out.println("**********************");

		//stream:
		names.stream().forEach(System.out::println);
		
		
		
		// Stream Cannot Do This
	//	names.stream().get(0); //  Compile-time error
		
	}

}
