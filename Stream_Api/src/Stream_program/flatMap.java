package Stream_program;

import java.util.Arrays;
import java.util.List;

public class flatMap {
	
	public static void main(String[] args) {
//		❓ Problem Scenario

//		You have nested data (list inside list).
		
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Ajit", "Shivam"),
			    Arrays.asList("Mahesh", "Ravi")
			);
		
		
		System.out.println("************************");
		
		
//		You want all names in one stream.
		
//		 What Happens with map() ❌
		 names.stream()
		.map(list -> list)
		.forEach(System.out::println);
		 
		 
		 
		 
		 
//		 flatMap() transforms each element into a stream and then flattens all resulting streams into a single stream.
		 
//		 Stream of Stream → One Stream
		  names.stream()
		 .flatMap(list->list.stream())
		 .forEach(System.out::println);
		 
		
		  
//		  Before flatMap()
//		  [ [Ajit, Shivam], [Mahesh, Ravi] ]
//
//		  After flatMap()
//		  [ Ajit, Shivam, Mahesh, Ravi ]
//		  


	}

}
