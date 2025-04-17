package ArrayConcepts;

/*
1. Declare an Array
2. Add values into an Array
3.Find length of an Array
4. Read single value from an Array
5.Read multiple values from an Array

*/

public class SingleDimentionalArrayExample {

	public static void main(String[] args)
	{
		//Approach 1
		//When to use?
			// size of the array is already known and no size change in future
			// Memory wastage is there

		/*int a[]=new int [5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;

		*/

		//Approach 2
		//

		//int a[]= {100,200,300,400,500}; // Decalaration and assigning the values are happening at the same time
		// we can store n number of values here
		//When to use?
		// Doesn't know size of the array and size will be changed in future
		// No memory wastage

		//find length of an array
		/*
		 * System.out.println("Length of an Array:"+a.length);
		 *
		 * //read single value from an array System.out.println(a[4]);
		 */

		//Note: if we don't give any value inside array then empty array will be created

		//int a[]= {};

		int a[]= {100,200,300,400,500};

		System.out.println("Length of an Array:"+a.length);

		//reading all the values from Array

		//Normal for loop

		/*for(int i=0;i<a.length;i++) // i<4 i<=5 i<a.length  i<=length-1
		//Note: if we don't know the length of the array, we can get it dynamically by using refname.length
		// Why we are mentioning -1 cuz total length is 0-4 only if we give 5, there is no element in 5 & that will throw array index out of bound exception
		{
			System.out.println(a[i]);
		}
		*/

		//Enhanced loop or for..each loop

		//Note: this is especially designed for Arrays and collections

		for (int i : a)
			//how it works?
			// a is a ref name of array has all the elements and : is assigning the a value to i and just printing in the syso
		{
			System.out.println(i);
		}



	}

}
