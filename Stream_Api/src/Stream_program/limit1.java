package Stream_program;

import java.util.Arrays;
import java.util.List;

public class limit1 {
	public static void main(String[] args) {
		
		/*
		 Real-World Scenario: Pagination

		Assume you have a list of records and you want to show data page by page.

		Page size = how many records per page

		Page number = which page you want to display

		🔢 Given Values
		int pageSize = 2;
		int pageNumber = 2;


		This means:

		Show 2 records per page

		Show page 2

		📐 Formula Explanation
		skip = (pageNumber - 1) * pageSize

		Why this formula?

		Page 1 → skip 0 records

		Page 2 → skip records of page 1

		Page 3 → skip records of page 1 + page 2

		So:

		skip = records in all previous pages

		Apply values:
		skip = (2 - 1) * 2
		skip = 2


		👉 Skip the first 2 elements
		
		*/
		

		        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

		        int pageSize = 2;
		        int pageNumber = 2;

		        nums.stream()
		            .skip((pageNumber - 1) * pageSize)
		            .limit(pageSize)
		            .forEach(System.out::println);
		    
		

		
		
		
		
	}

}
