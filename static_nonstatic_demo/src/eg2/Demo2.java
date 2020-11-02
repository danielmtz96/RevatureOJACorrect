package eg2;

// using method from a different package ("folder")

import eg3.Animal;

// Accessing a class within a different class
public class Demo2 {
	public static void main(String[] args) {
		Calculator.helloStaticCalci();
		
		Animal.helloStaticAnimal();
		
		Animal.helloStaticAnimal2();
		
		// creating an object 
		Calculator c = new Calculator();
		c.helloNonStatic();
		
		Animal a = new Animal();
		a.helloNonStaticAnimal();
		
		int result = c.add(100, 22);
		System.out.println("result = " + result);
		
		System.out.println("result = " + c.add(100, 22)); // only possible on non-void type
		
		System.out.println("result = " + c.add(100,  22, 222));
		
		System.out.println("result with floats = " + c.add(100f, 22f));
		
		c.add(100, 100, 220, 330); // calling a void method that prints on its own
	}
}
