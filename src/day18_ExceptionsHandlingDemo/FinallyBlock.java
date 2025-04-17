package day18_ExceptionsHandlingDemo;

public class FinallyBlock {

	public static void main(String[] args) {
		String s=null;//Exception occurs
		//String s="Welcome";// No exception

		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)// instead of Excepted exception if we write incorrect exception name
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());// This will give the detailed explation of Exception
		}
		finally
		{
			System.out.println("You entered into finally Block");
		}

		System.out.println("Program finished");
	}

}
