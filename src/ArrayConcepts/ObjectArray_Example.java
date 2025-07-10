package ArrayConcepts;

public class ObjectArray_Example {

	public static void main(String[] args) {

		Object a[]= {100,10.5,"WELCOME",'A',true};
		//Object is a predefined class, all the classes are derived from the same root object class
		//it is a super class or root class of all predefined classes in java

		// read all the values from an array
		//Approach 1
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/

		//Approach 2
		for (Object x : a)
		{
		System.out.println(x);	// why x only mentioned here and not a[x]
		// because variables in for-each loop represents the elements of the collection directly .
		//So there is no need of use index like a[x] .PS chatGPT
		}








	}

}
