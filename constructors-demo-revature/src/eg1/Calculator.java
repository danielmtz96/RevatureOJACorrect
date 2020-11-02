package eg1;

public class Calculator {
	
	private int x;
	private int y;
	
	// custom Constructor
	public Calculator(String name) {
		System.out.println("Hello " + name);
	}
	// when the programmer creates his/her own constructor, the compiler removes its default constructor
	
	public Calculator() {
		System.out.println("Non-parameter constructor");
	}
	
	public Calculator(int x, int y) {
		this.x = x; // variable shadowing
		this.y = y;
	}
	
	public int add() {
		return x + y;
	}
	
	public int multiply() {
		return x*y;
	}
	
	public int subtract() {
		return x - y;
	}
}
