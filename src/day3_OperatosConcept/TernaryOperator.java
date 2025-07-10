package day3_OperatosConcept;

public class TernaryOperator {

	public static void main(String[] args) {
		//Syntax --> Var = exp ? result 1 : result 2
		// Execution --> if the expression is true, first value will be assigned to the variable or if its false then second value will be assigned to x variable.

			//Example 1
			/*int a=200, b=100;
			
			int x=(a<b)?a:b; // if the expression is true x value will be assigned to x or if its false Y value will be assigned to x
			System.out.println(x);
			*/
			//Example 2
			//int x=(1==1)?100:200; // (1==1) will return true, so 100 will assign to x or if its false 200 will assign to x
			/*int x=(1!=1)?100:200;
			System.out.println(x);
			*/
		
			//Example 3
		
			int person_age=14;
			String res = (person_age>=18)? "Eligible" : "Not Eligible";
			System.out.println(res);
		
		
		
		
		
		
		
	}

}
