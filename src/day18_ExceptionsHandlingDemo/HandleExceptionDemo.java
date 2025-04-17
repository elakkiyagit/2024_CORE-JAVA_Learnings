package day18_ExceptionsHandlingDemo;

import java.util.Scanner;

public class HandleExceptionDemo {

	public static void main(String[] args) {
		System.out.println("program is started...");

		Scanner sc= new Scanner(System.in);
		//Example: 1
		System.out.println("Enter a number..");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);// if user gives 0 , it will throw ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid data");
			System.out.println(e.getMessage());// this method will give exactly what is entered wrong
		}

		System.out.println("program is inprogress...");
		System.out.println("program is Completed...");

	}

}
