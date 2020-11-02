package eg1;

import eg1.MyClass.InnerPublic;

public class DemoMain {
	public static void main(String[] args) {
		MyClass.mystatic(); // since it's a static method, you can just call it directly 
		                    // without instantiating a class
		
		MyClass c = new MyClass();
		c.myNonStatic(); // myNonstatic() is a non-static method (clearly), so you need to create an object
		                 // c that is an instance of MyClass() to access it
		
		// non-static method from non-static inner class
		MyClass.InnerPublic i = c.new InnerPublic();
		//MyClass.InnerPublic i = new MyClass.InnerPublic();  requires "enclosing instance" of myClass, which is why
		// we use c defined above.
		i.helloInnerPublic(); // helloInerPublic method is not static, so we create a "MyClass.InnerPublic" object
							  // i. We can use the MyClass object c to construct an InnerPublic object.
		
		MyClass.InnerStaticPublic.helloInnerPublicStatic();
		// static method from inner class - can access directly
		
		// nonstatic method from static inner class
		MyClass.InnerStaticPublic i2 = new MyClass.InnerStaticPublic(); 
		//MyClass.InnerStaticPublic i2 = c.new InnerStaticPublic();  //illegal enclosing instance message
		i2.helloInnerStaticNonStatic();
		
		
	}
}
