package Stream_program;

import java.util.Arrays;
import java.util.List;

public class reduce2 {
	
	public static void main(String[] args) {

		
//		Example: Sum with identity
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        
        int sum=nums.stream()
        		.reduce(0, (a,b)->a+b);
//        Adding 0 does not change the result
        
        
        System.out.println(sum);
        
        
System.out.println("******************");
        
//        Example: Product of numbers
        int product =
                nums.stream()
                    .reduce(1, (a, b) -> a * b);

        
//        Identity = starting value
//        		It must be a value that does NOT change the result of the operation.
//        For multiplication, identity is 1 because multiplying any number by 1 does not change the value, while multiplying by 0 always results in 0.
        
        System.out.println(product);
}
	
	
}