package day16_InterfaceConcepts;

public class c1 extends c2 implements I1,I2 //we can have both interface and class as a multiple
//parents but we should extends the class after that we can implements n number of Interfaces ,
//but class should be extends only class.
{

	@Override
	public void m1()
	{
		System.out.println(x);
	}

	@Override
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {

		c1 cobj= new c1();
		cobj.m1();
		cobj.m2();
		cobj.m3();

	}

}
