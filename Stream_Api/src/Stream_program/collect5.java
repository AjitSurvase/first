package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collect5 {
	
	public static void main(String[] args) {
		
//		6️ Collectors.joining()
//		 Used for Strings
		
		List<String> names = Arrays.asList("Ajit", "Shivam", "Mahesh");

		
		String result =names.stream()
				.collect(Collectors.joining(","));
		
		System.out.println(result);
		
//		Ajit,Shivam,Mahesh

		System.out.println("*********************");
//		7️ Collectors.counting()
		
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        long count = nums.stream()
                .collect(Collectors.counting());

        System.out.println(count);
		
		
	}

}
