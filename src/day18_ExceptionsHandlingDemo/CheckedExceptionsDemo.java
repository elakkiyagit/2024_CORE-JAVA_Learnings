package day18_ExceptionsHandlingDemo;

public class CheckedExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println("program inprogress");

		try
		{
		Thread.sleep(5000);//
		}
		catch (InterruptedException e)
		{

		}

		System.out.println("program finished");
		System.out.println("program exited");


	}

}
