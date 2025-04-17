package frequentlyAskedProgramm;

public class ReverseAString {

	public static void main(String[] args) {

		String s="ABCD";
		String rev="";

		//int len=s.length();

//		for (int i = len-1; i >=0; i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);

		//using char array

		/*char a[]=s.toCharArray();

		int len=a.length;

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		*/

		//using string builder
		StringBuilder str=new StringBuilder(s);
		StringBuilder reversedstring= str.reverse();
		System.out.println(reversedstring);

	}

}
