package ArrayConcepts;

import java.util.Arrays;

public class SortingAString {

	public static void main(String[] args) {

		// String datatype
		String s[]= {"Sam","John","David","Emma"};

		System.out.println("Before sorting:"+Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("After sorting:"+Arrays.toString(s));

		// Char datatype
		char c[]= {'A','V','k','B'};

		System.out.println("Before sorting:"+Arrays.toString(c));

		Arrays.sort(c);

		System.out.println("After sorting:"+Arrays.toString(c));


	}

}
