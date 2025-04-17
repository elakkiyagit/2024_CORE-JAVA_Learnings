package day16_InterfaceConcepts;

interface Shape
{
	int length=10;// in interface, variables are by-default final & static
	int width=20;// in interface, variables are by-default final & static

	// Interface allows 3 types of methods as mentioned below

	void circle();//abstract method

	default void square()//  default method i.e any method which is having default keyword as default method
	{
		System.out.println("This is square...- default method");
	}

	static void rectangle()//static  method i.e any method which is having static keyword as static method
	{
		System.out.println("This is rectangle...- static method");
	}

	// Note : JAVA 8 onwards interface allows static and default methods having implementation

}


public class Interface_demo implements Shape {

	int x=100,y=200;

	@Override
	public void circle()

	{
		System.out.println("This is circle-- This is abstract method");
	}

	void triangle()
	{
		System.out.println("This is triangle--");
	}

	public static void main(String[] args) {

		//scenario 1: creating object for the class itself

		Interface_demo idobj=new Interface_demo();
		//idobj.circle();//abstract
		//idobj.square();//default
		//Shape.rectangle();//static method can directly access from interface
		//idobj.triangle//method created in Interfacedemoclass
		//System.out.println(Shape.length * Shape.width);////accessing static variables directly
		//System.out.println(idobj.x+idobj.y);

		//scenario 2:

		Shape sh= new Interface_demo();
		sh.circle();//abstract
		sh.square();//default
		Shape.rectangle();//static method can directly access from interface//This static method is coming from interface not class
		//sh.trinagle();//We cannot access this method bcuz this is not part of the interface shape and the reference variable we are using is interface's.
		System.out.println(Shape.length * Shape.width); //accessing static variables directly
		//System.out.println(sh.x+sh.y);//we cannot access
	}

}


