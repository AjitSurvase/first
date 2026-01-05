package functional_interface;

import java.util.function.Predicate;

public class predicate1 {
	
	public static void main(String[] args) {
		
		
		//Using Annonymous Class
		Predicate<Integer>pr=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				if(t%2==0)
				{
					return true;
				}
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		System.out.println(pr.test(45));
		
		
		System.out.println("***********************");
		
		
		//Using Lambda Expression	
		
		Predicate<Integer>p =(i)->{
			if(i%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		};
		
		System.out.println(p.test(10));
		
		
		
		
		
	}

}
