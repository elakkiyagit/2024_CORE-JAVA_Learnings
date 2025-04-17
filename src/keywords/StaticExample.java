package keywords;

public class StaticExample {

	static int a=10;// static variable
	int b=20;// Non static variable

	static void m1()
	{
		System.out.println("this is a static method");
	}
	void m2()
	{
		System.out.println("this is a non static method");
	}

	//non-static methods can access everything directly.
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}


	public static void main(String[] args) {
		//1.Static methods can access static stuff(variable, methods) directly without creating object.
		System.out.println(a);
		m1();
		//System.out.println(b);// cannot access , b is non static
		//m2();// cannot access , m2 is non static

		StaticExample s= new StaticExample();
		s.m2();
		System.out.println(s.b);

	}

}
