package Polymorphisim;

public class ConstructorOverloading {

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
