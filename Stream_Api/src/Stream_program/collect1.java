package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collect1 {
	
	public static void main(String[] args) {
		
//		1️ Collectors.toList()
		
	    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
	    
	     List<Integer> number=nums.stream()
	       .map(i->i*i)
	       .collect(Collectors.toList());
	     
	     System.out.println(number);
		
	}

}
