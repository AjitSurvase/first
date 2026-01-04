package Stream_program;

import java.util.Arrays;
import java.util.List;

public class reduce4 {
	
	public static void main(String[] args) {
		
		
		 List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		 
		 
		 int max=nums.stream()
				 .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
		 
		  System.out.println(max);
		  
		  
		  System.out.println("**********************");
		  
//		  BETTER WAY 
		  int max1=nums.stream()
				  .reduce(Integer:: max)
				  .get();
		 
		  System.out.println(max1);
		
	}

}
