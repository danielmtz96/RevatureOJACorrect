package eg1;

public interface MyInterface1 {
	
	void method1(); // by default it is public & abstract
	
	int X = 10; //by default static and final within an interface
	
	void method2();
	void method3();
	void method4();
	void common();
	
	public interface InnerInterface {
		void inner1();
		void inner2();
	}
}
