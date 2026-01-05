package functional_interface;

import java.util.function.Predicate;

public class predicate_custom {
	
	public static void main(String[] args) {
		
		//using Annonymous Class
		Cars obj=new Cars(1000,"swift");
		Cars obj1=new Cars(100000,"maruti");
		
		
		Predicate<Cars> carPredicate =new Predicate<Cars>() {

			@Override
			public boolean test(Cars t) {
				// TODO Auto-generated method stub
			
				if(t.price>=100000)
				{
					return true;
				}
						
				return false;
			}
			
		};
		
		
	System.out.println(carPredicate.test(obj));	
	
	System.out.println("****************");
	System.out.println(carPredicate.test(obj1));		
	
	
	System.out.println("****************");

	//with lambda
	//
	
	Predicate<Cars>pred2=c->c.price>=10000;
	
	System.out.println(pred2.test(obj1));
	
	
		
	}

}



class Cars
{
	int price;
	String name ;
	
	public Cars(int price,String name) {
		
		this.price=price;
		this.name=name;
	}
	
}