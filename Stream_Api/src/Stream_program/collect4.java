package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect4 {
	
	public static void main(String[] args) {
		
//		/5️ Collectors.partitioningBy()
//		 Difference from groupingBy
//		Only two groups
//		Uses boolean condition
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		Map<Boolean, List<Integer>>map=nums.stream()
				.collect(Collectors.partitioningBy(n->n%2==0 ));
		
		System.out.println(map);
			
		
//		{false=[1, 3, 5], true=[2, 4]}
				
		
		
	}

}
