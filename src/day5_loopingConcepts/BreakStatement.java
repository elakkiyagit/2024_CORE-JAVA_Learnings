package day5_loopingConcepts;

public class BreakStatement {

	public static void main(String[] args) {

		// based on the condition we are breaking the loop using break statement

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
				//System.out.println(i);--> After break we should not give any statements that
				//will not execute and that is a syntax error.
			}
			System.out.println(i);
		}

	}

}
