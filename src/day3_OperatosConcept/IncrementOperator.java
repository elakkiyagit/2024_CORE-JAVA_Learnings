package day3_OperatosConcept;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called increment operator
		
		//case 1
		/*int a=10;
		System.out.println(a);
		
		a++;  // a=a+1;
		System.out.println(a);
		*/
		
		// case 2 - a++ means post increment - means first it'll assign the value & then increment will happen
		/*int a=10;
		int res=a++; //10 - because , 10 it assigned to result first , then increment happend
		System.out.println(res);//10
		System.out.println(a); //11
		*/
		
		// case 3 - ++a means pre increment - means first it'll increment the value & then assignment will happen
				int a=10;
				int res=++a; //11 - because increment will happen and then the value will be assigned
				System.out.println(res);//11
				System.out.println(a); //11 -here also "a" value is already increased, so we are getting the increased value
	}

}
