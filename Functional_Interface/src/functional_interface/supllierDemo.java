package functional_interface;

import java.util.Date;
import java.util.function.Supplier;

public class supllierDemo {
	
	public static void main(String[] args) {
		/* Supplier<T>
		Supplier<T>:
		Takes NO input
		Returns output
		Used to generate values
		*/
		
		
		Supplier<Double> s = () -> Math.random();
		
		
		System.out.println(s.get());
		
		
		
		System.out.println("**************************");
		
		Supplier<Date> dateSupplier = () -> new Date();
		System.out.println(dateSupplier.get());

//		Supplier is a functional interface that supplies or returns a value without taking any input
		
	}

}
