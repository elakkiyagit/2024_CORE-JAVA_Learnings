package constructor_Concepts;

public class Child extends Parent{

	public Child() {
		//super()
		System.out.println("Child constructor");
	}

	private void demo() {
		System.out.println("demo");

	}
	private void demo1() {
		System.out.println("demo1");

	}

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
