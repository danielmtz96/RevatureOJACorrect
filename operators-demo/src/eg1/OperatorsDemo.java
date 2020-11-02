package eg1;

import java.lang.Math;

public class OperatorsDemo {
	// Java operators examples
	public static void main(String[] args) {
		int x;
		// error message System.out.println("x before assigning: " + x);
		x = 3;
		System.out.println("value of x: " + x);
		
		// Parenthesis testing
		
		int y = 5;
		int z = 7;
		
		System.out.println("\nx + (y*z)");
		System.out.println("addmult: " + x + (y*z)); // value displayed is 3 concatenated with 35
		
		System.out.println("\n(x + y + z)");
		System.out.println("addmult: " + (x + y + z));
		
		// post-fix operators
		System.out.println("\nx++ = " + x++);
		System.out.println("new x value: " + x);
		
		System.out.println("\n--x = " + --x);
		System.out.println("nx-- = " + x--);
		System.out.println("new x value: " + x);
		
		// multiplicative operators
		// integers
		System.out.println("\nz/y = " + z / y);
		System.out.println("modulo z/y = " + z % y);
		
		// suppose we had doubles:
		double X = 5d;
	    double Y = 7d;
	    System.out.println("X value: " + X);
	    System.out.println("Double division: Y/X = " + Y/X);
	    
	    // bit-shift operators
	    int a = 3;
	    a = a << 2; //left-shift of bits
	    System.out.println("new a = " + a);
	    
	    int b = 12;
	    b = b >> 2;
	    System.out.println("new b = " + b);
	    
	    int c = -12;
	    System.out.println("-12 binary representation: " + Integer.toBinaryString(c));
	    c = c >>> 2;
	    System.out.println("new c = " + c);
	    
	    // ternary operators
	    
	    int i = 2;
	    int j = 3;
	    System.out.println("\nternary operator ");
	    String msg = (i < j)? "The condition is true" : "The condition is false!";
	    System.out.println(msg);
	    
	    // logical operator examples
	    int A = 2;
	    // OR
	    System.out.println("\n|| operator");
	    System.out.println(A > 2 || A <= 2);
	    
	    // AND
	    int B = 3;
	    System.out.println("\n&& operator");
	    if ((A == 2) && (B == 3))
	    	System.out.println("Both conditions are true");
	    
	    
	    // relational operators
	    System.out.println(2 <= 3);
	    
	    // instanceOf: object is an instance of a class...
	    String testString = "Hello";
	    System.out.println("\nIs 'Hello' an instance of a string?");
	    System.out.println(testString instanceof String);
	    
	    
	    
	}
		
}
