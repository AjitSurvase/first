package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
	
public static void main(String[] args) {
		
		Predicate<Integer>p=n->n>15;
		
		System.out.println(p.test(16));  //true
		
		System.out.println(p.test(4));    //false
		
		
		System.out.println("***************************");
		
		//using stream:
		
		// Creating a list
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        // Predicate condition: number > 10
        Predicate<Integer> pr = n -> n > 10;

        // Using Predicate with Stream API
        list.stream()
            .filter(pr)
            .forEach(System.out::println);
        
        
		
}
	
	

}
