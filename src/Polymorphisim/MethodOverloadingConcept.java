package Polymorphisim;

public class MethodOverloadingConcept {

	int a=10,b=20;

	void sum()
	{
		System.out.println(a+b);
	}

	void sum(int x,int y) // number of arguments is different from previous method
	{
		System.out.println(x+y);
	}

	void sum(int x,double y) // data type is different from previous method
	{
		System.out.println(x+y);
	}
	void sum(double	 x,int y) // order of parameters is different from previous method
	{
		System.out.println(x+y);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);// number of arguments is different
	}

	//Note:
	//(int a,int b,int c)- this part is called definition
	//System.out.println(a+b+c);- this part is called implementation

	public static void main(String[] args) {

		MethodOverloadingConcept obj= new MethodOverloadingConcept();
		obj.sum();
		obj.sum(10.5, 8);
		obj.sum(10, 8.5);
		obj.sum(10, 78);
		obj.sum(100, 200, 300);
		//obj.sum(3.6,8.9,9.0);// this will give error bcoz we don't have method like this in the implementation or defenition part
	}

}
