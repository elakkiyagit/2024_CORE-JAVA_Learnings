package day15_Polymorphisim_MethodOverriding;

class Bank
{
	double roi()
	{
		return 0;
	}
}
class ICICI extends Bank
{
	@Override
	double roi()
	{
		return 11.6;
	}
}
class SBI extends Bank
{
	@Override
	double roi()
	{
		return 19.8;
	}
}


public class OverridingDemo {

	public static void main(String[] args) {

		SBI s =new SBI();
		double roiofSBI=s.roi();
		System.out.println(roiofSBI);
	}

}
