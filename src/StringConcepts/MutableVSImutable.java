package StringConcepts;

import java.util.Arrays;

public class MutableVSImutable {

	public static void main(String[] args) {

		//Mutable can change
		int a[]= {45,67,12,23,90};

		System.out.println(Arrays.toString(a)); // to print the contents instead of memory address

		//to sort
		Arrays.sort(a);// Thru this operation we chnag the original value , this is called mutable

		System.out.println(Arrays.toString(a));

		//Immutable - cannot change

		String s = new String("Welcome");
		System.out.println(s);//Welcome
		s.concat("to java"); // using this operation we cannot change the original value
		System.out.println(s);//Welcome

		// if we want the concated string then we need to store it in some other variable and print that variable
		System.out.println(s);//Welcome
		String concatdstring=s.concat(" to java");
		System.out.println(s);
		System.out.println(concatdstring);


	}

}
