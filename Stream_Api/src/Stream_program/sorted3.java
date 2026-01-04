package Stream_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sorted3 {
	
	public static void main(String[] args) {
		/*
		3️⃣ Custom Sorting (Using Comparator)
		When you want:
		Descending order
		Sorting by length
		Sorting by any custom logic
		*/
		
//		Example 3: Descending Order (Integers)
		
		 List<Integer> nums = Arrays.asList(5, 1, 3, 2, 4,4);
		 
		 List<String> names = Arrays.asList("Ajit", "Shivama", "Mahesh");

		 
		 nums.stream()
		 //.distinct()
		 .sorted((a, b)-> b - a)
		 .forEach(System.out::println);
		 
		 System.out.println("****************");
		 
//		 Example 4: Sorting Strings by Length
		 
		 names.stream()
		 .sorted((a,b)->a.length()- b.length())
		 .forEach(System.out::println);
		 
		 
		 //using Comparator (Recommended)
		 
		 names.stream()
		 .sorted(Comparator.comparing(String::length))
		 .forEach(System.out::println);
		
		 
		
	}

}
