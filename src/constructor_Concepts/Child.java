package constructor_Concepts;

public class Child extends Parent{

	public Child() {
		//  super(); // Java adds this line automatically
		System.out.println("Child constructor");
	}

	private void demo() {
		System.out.println("demo");

	}
	private void demo1() {
		System.out.println("demo1");

	}
	
/*	Note: In Java, when a class inherits another class, the parent constructor is automatically called before the child constructor.

Even if you don’t write super(), Java puts it there for you by default.*/

	public static void main(String[] args)
	{
		/*new Child().demo();
		new Child().demo1();

		output:
			Parent constructor
			Child constructor
			demo
			Parent constructor
			Child constructor
			demo1
			*/
		//To overcome this we create object , using object ref we can call the method instead of creating the memory each time

		Child c=new Child();
		c.demo();
		c.demo1();
		//output
		/*Parent constructor
		Child constructor
		demo
		demo1*/


	}

}
