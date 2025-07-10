package day3_OperatosConcept;

public class OperatorsExample {

	public static void main(String[] args) {
		
		//1.Arithmetic operators  +  -  * /  %
		
		int a=20,b=10;
		
		System.out.println("sum of a and b is:"+ (a+b));
		System.out.println("Diff off a and b is:"+ (a-b));
		System.out.println("Multiplication of a and b is:"+ (a*b));
		System.out.println("Division of a and b is:"+ (a/b));
		System.out.println("Modulo Division of a and b is:"+ (a%b));
		
		//2. Relational/comparison operator   >    >=   <   <=   !=    ==  
		// returns boolean value - true/false
		
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		
		b=20;
		System.out.println(a!=b);//false
		System.out.println(a==b);//true
		
		//3.Logical operators  && || !  
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);// false
		System.out.println(x || y); // true
		
		boolean b1=10>20;
		System.out.println(b1);// false
		
		boolean b2= 20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2);// false
		System.out.println(b1 || b2); // true
		
		// writing the statement in combination of relational and logical operators
		System.out.println((10<20)&&(20>10)); //true
		
		
		

	}

}
