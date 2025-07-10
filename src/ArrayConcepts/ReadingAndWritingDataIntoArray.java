package ArrayConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		int a[]= new int[5];
		

	Scanner sc= new Scanner(System.in);


	for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter a value for the posistion "+i+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements:.......");
		System.out.println(Arrays.toString(a));// It will give the value in readable format
		
		//Note:
		//System.out.println(a);                    // prints something like [I@7f31245a
		//System.out.println(Arrays.toString(a));   // prints [1, 2, 3]
	}

}
