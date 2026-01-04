package Stream_program;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	
	public static void main(String[] args) {
		
//		Print elements (self-entered)
		
		List<Integer>nums=Arrays.asList(1,2,3,4);
		
		nums.stream()
		.forEach(n->System.out.println(n));
//		forEach() is a terminal operation used to perform actions like printing or updating external state.
		
}
}