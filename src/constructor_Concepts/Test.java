package constructor_Concepts;

public class Test {

	/*DefaultConstructor

		public static void main(String[] args) {

		Test t=new Test();
		//it will invoke the DefaultConstructor and stored in same class reference.
		//because there is no implementation part
		 *
		 *
	}*/

	//No-argument constructor
	/*public Test()
	{
		System.out.println("This is non-paramaterized");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
	}*/

	//Parameterized constructor

	public Test(int a)
	{
		System.out.println("Value of a is:"+a+" This is paramaterized");
	}
	public static void main(String[] args)
	{
		Test t=new Test(14);
	}

}
