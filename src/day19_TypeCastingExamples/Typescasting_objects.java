package day19_TypeCastingExamples;

class parent
{
	int x=100;
	void m1()
	{
		System.out.println("this is m1 method from parent class");
	}
}

class child extends parent
{
	int y=100;
	void m2()
	{
		System.out.println("this is m2 method from parent class");
	}
}

public class Typescasting_objects {

	public static void main(String[] args) {

		/*child c=new child();
		System.out.println(c.x);//parent
		c.m1();//parent
		System.out.println(c.y);//child
		c.m2();//child
		*/

		/*parent p=new child();//Upcasting//Parent class reference variable can always hold the child class object
		System.out.println(p.x);
		p.m1();
		//once the ref variable is as parent then we can call the
		//variables or methods only inside the parent buz parent ref is refering parent only
		*/


		//It is not possible
		/*child c= (child) new parent();//parent cannot be cast to child//Exception throws at runtime
		System.out.println(c.x);//parent
		c.m1();//parent
		System.out.println(c.y);//child
		c.m2();//child
		*/
	}

}
