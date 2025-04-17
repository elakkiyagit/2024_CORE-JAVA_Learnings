package ArrayConcepts;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {

		int a[]= {1,4,6,2};

		//To Print all the values in an Array

		System.out.println("Before sorting:"+Arrays.toString(a));//Arrays is a predefined java class
		// Arrays.toString(a)--> To print all kind of Array like string ,int,char etc

		Arrays.sort(a);// To sort all kind of Array like string ,int,char etc

		System.out.println("After sorting:"+Arrays.toString(a));
	}

}
