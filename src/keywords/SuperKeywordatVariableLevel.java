package keywords;

class A
{
	int a=100;

}

class B extends A
{
	int a=200;
	void display()
	{
		System.out.println(super.a);
	}
}

public class SuperKeywordatVariableLevel {

	public static void main(String[] args) {

		B b =new B();
		b.display();
	}

}
