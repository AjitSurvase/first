package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class collect2 {
	
	public static void main(String[] args) {
		
//		2️ Collectors.toSet()
		
		List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3);
		
		Set<Integer> set=nums.stream()
		.collect(Collectors.toSet());
		
		
         System.out.println(set);
		
		
         
         
	}

}
