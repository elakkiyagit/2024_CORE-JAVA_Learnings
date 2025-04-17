package day19_TypeCastingExamples;

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}

public class Typecasting_Objects_userdefinedclasses {

	public static void main(String[] args) {

		//Rule 1:// conversion is valid or not.
		//The type of 'd'  and 'C' must have relationship as parent or child / child or parent

		/*Animal an=new Animal();
		Cat c=(Cat)an;// valid as per Rule 1
		System.out.println(c);
		*/

		//Rule 2://Assignment is valid or not
		//'c' must be either same or child class of 'A'

		/*Animal an=new Dog();
		Cat c=(Cat)an;// valid as per Rule 2
		Animal an=new Dog();
		Cat c=(Dog)an;// Invalid as per Rule 2
		*/

		//Rule 3:
		// The underlying object type of 'd' must be either same or child class of 'C'.
		//Note: if Rule 3 is failed, no compiler time error but it will throw run time Error as "classcastException"
		/*Animal an=new Dog();
		Cat c=(Cat)an;// Invalid as per Rule 3
		*/

		//Rule1,Rule2,Rule3
		Animal an=new Dog();
		Dog d=(Dog)an;//Rule1-yes,Rule2-yes,Rule3-yes
		System.out.println(d);





	}

}
