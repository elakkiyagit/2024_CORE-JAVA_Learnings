package day19_TypeCastingExamples;

public class Typecasting_Primitivedatatypes {

	public static void main(String[] args) {
		//upcasting-automatic..smaller to larger
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);

		float floatvalue= 3.6f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		*/

		//Downcasting-Manually ---larger to smaller

		double doublevalue =65.767;
		int intvalue1=(int) doublevalue;
		System.out.println(intvalue1);// original value is missed , output-65

		long longvalue =122267;
		int intvalue2=(int) longvalue;
		System.out.println(intvalue2);

		/* double doublevalues =85.769;
		float floatvalue=(float) doublevalues;
		System.out.println(floatvalue);
		*/

		double doublevalues =85.7691121212121212121212;
		float floatvalue=(float) doublevalues;
		System.out.println(floatvalue);

		//output-85.76911--> missing or truncated values becuz float can't hold large number,
		//as same as double holds (This is the disadvantage of downcasting)


	}

}
