package day18_ExceptionsHandlingDemo;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program is started....");
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());// This will give the detailed explation of Exception
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());// This will give the detailed explation of Exception
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());// This will give the detailed explation of Exception
		}
		System.out.println("program is Ended....");

	}

}
