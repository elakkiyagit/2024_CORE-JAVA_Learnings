package day5_loopingConcepts;

public class WhileloopExample {

	public static void main(String[] args) {

		//syntax
		/*
		 * initialization
		 *  while(condition)
		 *   {
		 *   statements;
		 *    inc/dec
		 *   }
		 */
		//Example 1 - print the even numbers between 1 to 10

		/*int i=1;
		while(i<=10) // this condition decides how many times loop should be executed
		{
			if(i%2==0) // this condition filters, at what basis the statements needs to executed
			{
				System.out.println(i);
			}
			i++;

		}*/

		//Example 2 - If you are uncertain about the number of iterations and
		//loop termination is based on the condition , then while loop is a good choice.

		int i=1;
		while(true)
		{
			System.out.println("Elakkiya");
			i++;

			if(i==10)
			{
				break;
			}


		}


	}

}
