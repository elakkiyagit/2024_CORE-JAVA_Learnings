package ArrayConcepts;

public class ReverseAnArray {

	public static void main(String[] args) {

		int a[] = {100,200,300,400,500,600};

		//a.length will give how many elements we have but index starts from 0 so, we are reducing that to 1

		for(int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]);
		}

	}

}
