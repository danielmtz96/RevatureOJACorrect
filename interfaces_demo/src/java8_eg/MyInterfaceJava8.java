package java8_eg;

public interface MyInterfaceJava8 {
	public static void helloStatic() {
		System.out.println("hello from static methods in interface from java8");
	}
	
	default void helloDefault() { // need to explicitly use default keyword because actual 'default' in interface
		// is public
		System.out.println("Hello from default method definitions from Java8 within interfaces");
	}
}
