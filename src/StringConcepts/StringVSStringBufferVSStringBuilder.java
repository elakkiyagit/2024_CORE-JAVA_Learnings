package StringConcepts;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {

		//String-Immutable

		String s = new String("Welcome");
		System.out.println(s);//Welcome
		s.concat("to java"); // using this operation we cannot change the original value
		System.out.println(s);//Welcome//Immutable, cannot change the original value of s

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
