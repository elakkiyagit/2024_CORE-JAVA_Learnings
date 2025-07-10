package StringConcepts;

public class StringComparision {

	public static void main(String[] args) {
		//case 1- When we create a string like this we can use both == and equals, that will return the same output
		/*String s1="welcome";
		String s2="welcome"; 
		System.out.println(s1==s2);//true //checks memory address
		System.out.println(s1.equals(s2));// true //checks contents are same
		*/
		//case 2- When we create a string with object then it acts like below

		/*String s1=new String( "welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2);//false // compares the objects
		System.out.println(s1.equals(s2));// true // compares the values of the objects
		*/

		//case 3- combination string declaration

		/*String s1="welcome";// here s1 has object or not does not matter because here also  == checks only the objects
		String s2=new String("welcome");
		System.out.println(s1==s2);//false // compares the objects
		System.out.println(s1.equals(s2));// true // compares the values of the objects
		*/

		//case 4-
		String s1="welcome";
		String s2=new String("welcome");
		String s3=s2;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true

		System.out.println(s2==s3);//true //bcoz objects are same/equal
		//here we are just assigning the object to another object,
		//so both objects [s2 and s3] are referring the same value


	}

}
