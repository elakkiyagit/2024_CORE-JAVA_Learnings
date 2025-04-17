package ArrayConcepts;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		System.out.println("Entered number is:"+num1);

		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Your name is:"+name);

		System.out.println("Enter Decimal number:");
		double d= sc.nextDouble();
		System.out.println("Entered decimal value is:"+d);



	}

}
