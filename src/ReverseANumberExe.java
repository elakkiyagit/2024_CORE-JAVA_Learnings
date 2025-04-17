
public class ReverseANumberExe {

	public static void main(String[] args) {

		int num= 1234;

		int revnum;

		for(int i=1; i>0;i++)
		{

			revnum=num%10;
			num=num/10;

			System.out.println(revnum);
		}
	}

}
