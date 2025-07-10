package keywords;

public class Static_Mixed_example {
	
	 static void staticMethod() {
	        System.out.println("Inside staticMethod()");
	        // Can't call nonStaticMethod() directly here ❌
	        Static_Mixed_example obj = new Static_Mixed_example();
	        obj.nonStaticMethod(); // ✅ correct way
	    }

	    void nonStaticMethod() {
	        System.out.println("Inside nonStaticMethod()");
	       // staticMethod(); // ✅ static method can be called from non-static directly
	    }

	    public static void main(String[] args) {
	    	Static_Mixed_example obj = new Static_Mixed_example();
	        //obj.nonStaticMethod(); // will also call staticMethod()
	    	staticMethod();
	    }

}
