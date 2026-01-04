package Stream_program;

import java.util.HashMap;
import java.util.Map;

public class second {
   

	public static void main(String[] args) {
		
	    String str="welcome to india";
	  
		Map<Character,Integer>map=new HashMap<Character, Integer>();
	    
		for(char c:str.toCharArray())
		{
//			
//			if (c == ' ') {     
//                continue;
//            }
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		
		for(Map.Entry<Character, Integer> e:map.entrySet()) {
			System.out.println(e);
		}
		
	}

}
