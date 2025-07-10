package day3_OperatosConcept;

public class DecrementOperator {

	public static void main(String[] args) {
		// -- is called decrement operator
		
				//case 1
				/*int a=10;
				System.out.println(a);
				
				a--;  // a=a-1;
				System.out.println(a);
				*/
				
				// case 2 -> a-- means post decrement - means first it'll assign the value & then decrement will happen
				int a=10;
				int res=a--; //10 - because , 10 it assigned to result first , then decrement happend
				System.out.println(res);//10
				System.out.println(a); //9
				
				
				// case 3 -> --a means pre increment - means first it'll decrement the value & then assignment will happen
						/*int a=100;
						int res=--a; //11 - because increment will happen and then the value will be assigned
						System.out.println(res);//99
						System.out.println(a); //99 -here also "a" value is already decreased, so we are getting the decreased value
						*/
				
	}

}
