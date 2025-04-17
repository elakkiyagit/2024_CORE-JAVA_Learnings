package ArrayConcepts;

import java.util.Scanner;

public class TakingMultipleInputsfromUser {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		System.out.println("Entered number is:"+num1);

		System.out.println("Enter a number:");
		int num2=sc.nextInt();
		System.out.println("Entered number is:"+num2);

		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Your name is:"+name);

		System.out.println("Enter a unknown value");
		Object value = sc.next();// next will accepts all the values regardless of type but those are considered as string
		//if we want to perform any operation on those data we need to change the datatype from string to required one.
		//Object accepts all the datatypes
		System.out.println("entered value is:"+value);

	}

}
