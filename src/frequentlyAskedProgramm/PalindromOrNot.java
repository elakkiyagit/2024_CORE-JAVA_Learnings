package frequentlyAskedProgramm;

public class PalindromOrNot {

	public static void main(String[] args) {

		String s = "LOL";
		String rev = " ";

		for (int i = s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		if(s.equals(rev))
		{
			System.out.println("It is a Palindrom:");
		}
		else
		{
			System.out.println("It is not a palindrom");
		}
	}

}
