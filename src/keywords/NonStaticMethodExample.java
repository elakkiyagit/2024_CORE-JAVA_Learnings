package keywords;
// 1. Calling a method from another method (non-static)
public class NonStaticMethodExample {
	  void greet() {
	        System.out.println("Hello from greet()");
	        showMessage(); // calling another method
	    }

	    void showMessage() {
	        System.out.println("This is showMessage() method.");
	    }

	    public static void main(String[] args) {
	    	NonStaticMethodExample obj = new NonStaticMethodExample();
	        obj.greet();  // indirectly also calls showMessage()
	    }
}
