package StringConcepts;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {

		//String-Immutable

		String s = new String("Welcome");
		System.out.println(s);//Welcome
		s.concat("to java"); // using this operation we cannot change the original value
		System.out.println(s);//Welcome//Immutable, cannot change the original value of s
		s=s.concat("to java"); // by storing it to a variable we can see the newly created one
		System.out.println(s);
		
		//Because String.concat() does not change the original string s.
		//Instead, it returns a new string and we need to assign it to a variable if we want to see the newly created string.
		
		

		//StringBuffer- mutable

		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to java");
		System.out.println(sb);//Welcome to java//mutable, can change the original value of s

		//Stringbuilder -mutable

		StringBuilder sbl =new StringBuilder("Welcome");
		sbl.append(" to selenium");
		System.out.println(sbl);//Welcome to selenium	//mutable, can change the original value of s












	}

}
