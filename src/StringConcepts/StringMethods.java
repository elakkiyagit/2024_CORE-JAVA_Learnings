package StringConcepts;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//String s= "Welcome";
		//String s=new String("Welcome");

		//length()- returns length of a string(number of characters)

		String s= "Welcome";
		int l=s.length();
		System.out.println(l);
		System.out.println("Welcome".length());
		System.out.println("---------------------------------");
		
		//concat - to join the strings
		String s1= "Elakkiya";
		String s2="Jothi";
		String s3="Ramalingam";
		System.out.println("---------------------------------");
		
		//concat with variables
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2+s3);
		System.out.println("Elakkiya"+(s2+s3));
		System.out.println("---------------------------------");
		
		//concat without variables

		System.out.println("welcome"+" to java");
		System.out.println("Welcome".concat(" to automation"));
		System.out.println("---------------------------------");
		
		//charAt()--> returns a character from a string based on index
		//index starts from 0
		s="welcome";
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(0));
		System.out.println("---------------------------------");
		//contains()--returns true/false
		//checks string is part of the main string or not
		// the given value is part of the string it will return True if not false. So, it will return boolean value
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("Wel"));//false
		System.out.println(s.contains("COME"));//false cuz string is case sensitive
		System.out.println(s.contains("Welme"));//false
		System.out.println(s.contains("welme"));//false
		
		System.out.println("---------------------------------");
		//equals(),equalsIgnorecase()- To compare strings
		// Both are used to compare the strings but equalsIgnorecase() ignores the case sensitivity where as equals compare with case sensitivity
		s1="welcome";
		s2="welcome";

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		System.out.println("---------------------------------");
		
		//replace()-replace single/multiple (sequence) of characters in a string
		s="Welcome to selenium java selenium python selenium C#";
		System.out.println(s.replace("e", "X"));
		System.out.println(s.replace("selenium", "Playwright"));
		System.out.println("---------------------------------");

		//substring()-extract substring from the main string
		//Staring index count from 0
		//Ending index count from 1
		s="selenium";
		System.out.println(s.substring(0, 3));//sel
		System.out.println(s.substring(1, 7));//eleniu
		System.out.println("---------------------------------");
		
		//toUppercase() and toLowercase()
		s="Selenium";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("---------------------------------");

		//split()-split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a));//to print all the elements in the array
		System.out.println(a[0]);//abc
		System.out.println(a[1]);//gmail.com
		System.out.println("---------------------------------");

		//ex1
		String amount="$45,67,89";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",", ""));
		System.out.println("---------------------------------");

		//ex2
		s="abc,123@xyz";
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1));//[abc, 123@xyz]
		

		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));//[123, xyz]

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println("---------------------------------");

		//ex3
		s="abc 123 xyz";
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

		// Note: if we have multiple delimeters we need to use multiple splits

		//* % ^ & ( )- we cannot use these as a delimeters

		//Exercise
		// How check the name is present in the main string without using equalsignorecase

		s="John kenedy";
		System.out.println(s.contains("john"));//false

		System.out.println(s.replace('J', 'j').contains("john"));

		System.out.println(s.toLowerCase().contains("john"));

		//Note: In Automation , if we want to check each webpage is having the same title, we can use equals method

		//Mostly used methods in Automation

		//Contains,substring







	}

}
