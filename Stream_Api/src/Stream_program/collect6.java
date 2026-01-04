package Stream_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect6 {
	
	
	public static void main(String[] args) {
		
//		Count frequency of each element
		List<String> names = Arrays.asList("Ajit", "Amit", "Ajit", "Rahul", "Amit", "Ajit");
                                            
//		.counting() is defined to return Long, not Integer.
        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        System.out.println(map);
	}

}

//{Rahul=1, Amit=2, Ajit=3}
