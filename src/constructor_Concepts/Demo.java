package constructor_Concepts;

public class Demo {



	//non-parameterized

	public Demo()
	{
		System.out.println("non-parameterized");
	}
	public Demo(int a)
	{
		System.out.println("The value of a is:"+a+" parameterized");
	}
	public static void main(String[] args) {

		Demo d=new Demo();// it calls the non-parameterized
		Demo s=new Demo(23);// it calls the parameterized
	}

}
