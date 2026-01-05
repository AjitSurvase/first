package method_refernce;

public class Static_Method_Reference {
	public static void main(String[] args) {
		
		Demo d=Test::display;
		d.show();
		
		
	}

}
//Q: When do we use static method reference?
//A: When a lambda expression simply calls a static method.

interface Demo
{
	void show();
	
}

class Test {
	static void display()
	{
		System.out.println("static method refernce");
	}
}