package Stream_program;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	
	public static void main(String[] args) {
		
//		 1️: anyMatch()

//		 Returns true if AT LEAST ONE element matches the condition.

        List<Integer> nums = Arrays.asList(1, 3, 5, 8);
           
       boolean result= nums.stream()
        .anyMatch(i->i%2==0);
       
       System.out.println(result);
       
       
	}

}
