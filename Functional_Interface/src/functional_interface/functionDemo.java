package functional_interface;

import java.util.function.Function;

public class functionDemo {
	
	public static void main(String[] args) {
		/*
		4️ Function<T, R>
	
		Function<T, R>:
		Takes one input
		Returns one output
		Used for data transformation
		*/
		
		
		Function<Integer, Integer>f=i->i*i;
		
		System.out.println(f.apply(5));    //25


		System.out.println("*****************");
		
//		Real Use:
		
		Function<String, Integer>length=s->s.length();
		
		System.out.println(length.apply("java"));//4
		
//		Function is a functional interface that accepts one input and returns a result.
		
	}

}
