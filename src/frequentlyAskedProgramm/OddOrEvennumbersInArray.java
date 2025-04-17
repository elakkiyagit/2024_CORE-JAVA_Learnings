package frequentlyAskedProgramm;

public class OddOrEvennumbersInArray {

	public static void main(String[] args)
	{
		int a[]= {3,5,8,2,10};
		int oddnumbers=0;
		int evennumbers=0;

		for(int i=0;i<4;i++)
		{
			if(a[i]%2==0)
			{
				evennumbers=evennumbers+a[i];
				System.out.println("Number of Even numbers:"+evennumbers);
			}
			else
			{
				oddnumbers=oddnumbers+a[i];
				System.out.println("Number of odd numbers:"+oddnumbers);
			}
		}




	}

}
