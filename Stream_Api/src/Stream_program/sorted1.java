package Stream_program;

import java.util.Arrays;
import java.util.List;

public class sorted1 {
	public static void main(String[] args) {
		
//		Example 2: Sorting Strings
		
		List<String> names = Arrays.asList("Ajit", "Shivam", "Mahesh");

		names.stream()
		     .sorted()
		     .forEach(System.out::println);

	}

}
