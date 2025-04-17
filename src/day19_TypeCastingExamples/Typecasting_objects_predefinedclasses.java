package day19_TypeCastingExamples;

public class Typecasting_objects_predefinedclasses {

	public static void main(String[] args) {
		//Ex:1
		//Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer)o;//Rule1-yes,Rule2-Yes,Rule3-failed

		//Ex:2
		//String s=new String("Welcome");
		//StringBuffer sb=(StringBuffer)s;//Rule1-failed

		//Ex:3
		//Object o=new String("Welcome");
		//StringBuffer sb=(String)o;//Rule1-yes,Rule2-failed, so no need to check Rule 3

		//Ex:4
		Object o=new String("Welcome");
		String sb=(String)o;//Rule1-yes,Rule2-Yes,Rule3-yes
		System.out.println(sb);



	}

}
