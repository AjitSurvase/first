package method_refernce;

public class Instance_Method_Reference {
	public static void main(String[] args) {
		
		Test1 t=new Test1();

        // instance method reference
        Demo1 d = t::display;

        d.show(); // calling functional interface method
		

}
}

interface Demo1
{
	void show();
}

class Test1
{
	void display()
	{
		System.out.println("instance method refernce");
	}
}