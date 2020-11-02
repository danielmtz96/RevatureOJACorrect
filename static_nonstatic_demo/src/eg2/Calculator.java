package eg2;

public class Calculator {
	public static void helloStaticCalci() {
		System.out.println("Hello from helloStaticCalci()");
	}
	
	public void helloNonStatic() {
		System.out.println("Hello from nonStatic cal");
	}
	
	public int add(int a, int b) {
		//since we don't have void keyword, this method needs to return something
		return a + b;
	}
	
	// same method name but different parameter list: method overloading
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// same method name but also different parameter list w/ floats
	
	public float add(float a, float b) {
		return a + b;
		
	}
	
	// overloading depends on parameters, not "void" keyword
	public void add(int a, int b, int c, int d) {
		System.out.println("a + b + c + d = " + (a + b + c + d)); // can just call it. Look up precedence
	}
}
