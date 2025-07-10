package keywords;
//2. Calling a static method from another static method
public class StaticMethodExample {
	 static void display() {
	        System.out.println("Inside display() method");
	        show();  // calling another static method
	    }

	    static void show() {
	        System.out.println("Inside show() method");
	    }

	    public static void main(String[] args) {
	        display(); // calls both display and show
	    }
}
