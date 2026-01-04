package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect3 {
	
	public static void main(String[] args) {
		
//		4️ Collectors.groupingBy() 
//		Example: Group Numbers by Even / Odd
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		
		
		Map<String, List<Integer>>map=nums.stream()
				                  .collect(Collectors.groupingBy(n->n % 2 ==0 ?"even":"odd"));
		
		System.out.println(map);
		
		   
		
//		{even=[2, 4], odd=[1, 3, 5]}
		
		
	}

}
