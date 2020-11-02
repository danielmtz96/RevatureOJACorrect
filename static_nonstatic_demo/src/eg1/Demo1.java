package eg1;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Hello!");
		myStaticMethod();
		
		Demo1 d = new Demo1();
		d.myNonStaticMethod1();
		d.myNonStaticMethod2();
		
		
	}
	// anything which is non-static creates an object of that class to access it
	// object creation Syntax:  
	// ClassName objName = new Constructor();
	// Constructor will have same name as class name
	// new: dynamic memory allocation
	
	public static void myStaticMethod() {
		System.out.println("Hello from myStaticMethod()");
	}
	
	public void myNonStaticMethod1() {
		System.out.println("Hello from myNonStaticMethod1");
	}
	
	public void myNonStaticMethod2() {
		System.out.println("Hello from myNonStaticMethod2");
	}

	
}
