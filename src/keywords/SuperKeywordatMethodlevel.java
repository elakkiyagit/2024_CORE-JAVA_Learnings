package keywords;

class Animal
{
	void colour()
	{
		System.out.println("white");
	}
}
class Dog extends Animal
{
	@Override
	void colour()
	{
		//System.out.println("Black");
		super.colour();// Using super keyword at method level
	}
}

public class SuperKeywordatMethodlevel {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.colour();

	}

}
