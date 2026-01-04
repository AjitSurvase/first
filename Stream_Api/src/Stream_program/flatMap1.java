package Stream_program;

import java.util.Arrays;
import java.util.List;

public class flatMap1 {
	
	public static void main(String[] args) {
		
	   // Example 2: Split Words into Characters
		
		List<String> words = Arrays.asList("JAVA", "STREAM");
		
		
		 words.stream()
		.map(i->i.split(""))
//		.forEach(System.out::println);          //address output
		.forEach(arr -> System.out.println(Arrays.toString(arr)));
		 
		 
     System.out.println("********************");
		 
		 
//		 Now using flatMap()
		 
		 words.stream()
	     .flatMap(word -> Arrays.stream(word.split("")))
	     .forEach(System.out::println);

		 
	}

}
