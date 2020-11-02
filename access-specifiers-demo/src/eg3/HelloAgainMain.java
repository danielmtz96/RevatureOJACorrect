package eg3;

import eg2.Hello;

//use extends to make any class as child of other class
// child gets all the properties of the parent apart from anything which is private in parent
// DIFFERENT PACKAGE, CHILD CLASS case

public class HelloAgainMain extends Hello{
	// should be able to use: public and protected methods
	// accessing protected method requires a trick
	public static void main(String[] args) {
	
	Hello h = new Hello(); // parent class
	h.helloPublic();
	
	// protected and default is only within the package
	// for protected it is only accessible in child classes if they are outside the package, too
	//h.helloDefault();
	//h.helloProtected(); can ONLY do this if we're in the same package.
	// private
	//h.helloPrivate();
	
	//accessing protected. Need an instance of child class to access non-static protected method from parent class
	HelloAgainMain m = new HelloAgainMain();
	m.helloProtected();
	}
	
	//constant
	final int x = 100;
	//x = 9; can no longer modify x
}


