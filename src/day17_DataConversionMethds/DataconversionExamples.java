package day17_DataConversionMethds;

public class DataconversionExamples {

	public static void main(String[] args) {

		//String ---> int

		//String s="welcome" // cannot convert into int

		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		//String---> Double

		String s3="10.6";
		String s4="7.8";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

		//String--->Boolean

		String s5="Selenium";//other than true, if we pass any String that will return false
		System.out.println(Boolean.parseBoolean(s5));

		//int,double,bool,char

		int a=10;
		double d=4.5;
		boolean bool=true;
		char c='A';

		String s= String.valueOf(a);
		System.out.println(s);

		s=String.valueOf(d);// String variable s is already created,
		//so if we use the same variable name then existing value will be replaced with the new value
		System.out.println(s);

		s=String.valueOf(bool);
		System.out.println(s);

		s=String.valueOf(c);
		System.out.println(s);


	}

}
