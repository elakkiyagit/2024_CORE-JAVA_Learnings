package ArrayConcepts;

public class TwoOrMultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1
				//When to use?
					// size of the array is already known and no size change in future
					// Memory wastage is there
					// It is called fixed array
		/*
		 * int a[][]=new int [3][2];
		 *
		 *  a[0][0]=100;
		 *  a[0][1]=200;
		 *
		 * a[1][0]=300;
		 * a[1][1]=400;
		 *
		 * a[2][0]=500;
		 * a[2][1]=600;
		 *
		 * System.out.println(a[2][1]);
		 */

		//Approach 2

		int a[][] = {
						{100,200},
						{300,400},
						{500,600}
					};

		//Find size of an array
		System.out.println("length of rows:"+a.length);
		System.out.println("length of column:"+a[0].length);//Go to specific row and find out length that will give particular column

		//how to find single value from Array
		System.out.println(a[2][1]);

		//normal for loop
		/*for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}*/

		//enhanced for loop
		for (int arr[] : a) // a- contains complete array & first row of the table has captured and assigned to arr[]
							// why we use arr[]--> To store multiple values in single variable we use single dimentional array
		{
			for (int x : arr) //arr contains first row of data and assigning to x one by one per iteration
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
