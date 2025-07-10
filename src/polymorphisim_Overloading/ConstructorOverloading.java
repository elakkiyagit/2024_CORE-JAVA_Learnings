package polymorphisim_Overloading;

public class ConstructorOverloading {
/*1. "We use constructor to initialize variables at runtime"
 *  2. "We are not printing anything inside the constructor"
 *  3. "volume() method is used to perform logic based on initialized data"
 *  
 *  “We use constructors to initialize object data during runtime. 
 *  Later, when we want to perform any operation using that data, we call a method.
 *   So here, volume() uses the values set by the constructor to calculate and return the result.”
 */
	double width, height, depth;

	ConstructorOverloading()

	{
		width = height = depth = 0;
	}

	 ConstructorOverloading(double w,double h,double d)
	 {
		 width=w;
		 height=h;
		 depth=d;
	}
	 ConstructorOverloading(double a)
	 {
		 width = height = depth = a;
	 }

	 double volume()
	 {
		 return(width*height*depth);
	 }



	public static void main(String[] args) {

		ConstructorOverloading c1 =new ConstructorOverloading();//default constructor
		ConstructorOverloading c2=new ConstructorOverloading(10.5);//paratemetrized
		ConstructorOverloading c3=new ConstructorOverloading(10.5,7.8,8.0);//paratemetrized
		System.out.println(c1.volume());
		System.out.println(c2.volume());
		System.out.println(c3.volume());
	}

}
