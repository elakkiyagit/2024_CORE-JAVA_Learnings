package frequentlyAskedProgramm;

public class SmallestOf3nums {

	public static void main(String[] args) {

		int a=10,b=5,c=30;

		if(a<b && a<c)
		{
			System.out.println("a is a smallest number:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is a smallest number:"+b);
		}
		else
		{
			System.out.println("c is a smallest number:"+c);
		}

	}

}
