package day15_Polymorphisim_MethodOverriding;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ extends ABC
{
	@Override
	void m1(int a)//overriding
	{
		System.out.println(a*a);
	}
	void m2(int a, int b )//overloading
	{
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {

		XYZ xyz = new XYZ();
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(30,90);

	}

}
