package day18_ExceptionsHandlingDemo;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("program is started...");

		Scanner sc= new Scanner(System.in);
		//Example: 1
		/*System.out.println("Enter a number..");
		int num=sc.nextInt();
		System.out.println(100/num);// if user gives 0 , it will throw ArithmeticException
		*/

		//Example 2:
		/*int a[]=new int[5];
		System.out.println("Enter a position(0-4)..");
		int pos = sc.nextInt();
		System.out.println("Enter a value..");
		int value=sc.nextInt();
		a[pos]=value;//ArrayIndexoutofboundException
		System.out.println(a[pos]);
		*/
		//Example 3:
		/*String s="Welcome";
		int val = Integer.parseInt(s);//NumberFormatException
		System.out.println(val);

		*/

		//Example 4:
		/*String s=null;
		int length = s.length();//NullpointerException
		System.out.println(length);
		*/
		System.out.println("program is inprogress...");
		System.out.println("program is Completed...");
	}

}
