package frequentlyAskedProgramm;

public class largestOf2nums {

	public static void main(String[] args) {
		//Approach 1

		  int a=10,b=60;
		 /*  if(a>b)
		 *   {
		 *   System.out.println("a is a largest number:"+a);
		 *   }
		 * else
		 *  {
		 *  System.out.println("b is a largest number:"+b);
		 *  }
		 */
		//Approach 2 - ternary operator

		int var =(a>b)?a:b;
		System.out.println("largest number is: "+var);

	}

}
