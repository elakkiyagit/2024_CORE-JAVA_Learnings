package ArrayConcepts;

public class MissingNumberInArray {

	public static void main(String[] args) {

		//Pre-requiest
		// value should be in range
		// Array no need to be in sorted order
		// Array should not have duplicates

		int a[]= {1,3,4,5};

		//1+3+4+5=13 sum1
		//1+2+3+4+5=15 sum2
		//sum1-sum2=15-13=2

		int sum1=0;

		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in Array:"+sum1);

		int sum2=0;

		for (int i = 1; i<=5; i++) //range should be mentioned as condition here ;
			// as we are checking the value inside array not index
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements in Array:"+sum2);
		System.out.println("Missing number is: "+(sum2-sum1));
	}

}
