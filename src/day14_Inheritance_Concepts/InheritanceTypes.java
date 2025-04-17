package day14_Inheritance_Concepts;

//Single inheritance
class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}
// Multi level inheritance
class C extends B

{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

// In inheritance, only main class should  have the "public" access modifiers and,
//all other classes should not have otherwise system will throw error

public class InheritanceTypes {

	public static void main(String[] args) {

		/*B obj =new B();

		System.out.println(obj.a);
		System.out.println(obj.b);

		obj.display();
		obj.show();*/

		C cobj= new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;

		cobj.display();
		cobj.show();
		cobj.print();



	}

}
