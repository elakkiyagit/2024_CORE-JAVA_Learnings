package ArrayConcepts;

public class FindhowmanyDuplicates {

	public static void main(String[] args) {

		int a[]= {100,100,300,400,100};

		int num=100;
		int count=0;

		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}

		}
		System.out.println(count);
	}

}
