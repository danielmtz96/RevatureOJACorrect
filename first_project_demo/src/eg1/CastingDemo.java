package eg1;

public class CastingDemo {
	public static void main(String[] args) {
		/*
		 * Type casting is a way to convert one primitive type to another.
		 * There are 2 types
		 * 1) Implicit casting - done by the java compiler by default when we are trying to assign a data type
		 *    smaller in size to the larger in size.
		 * 2) Explicit casting - should be taken care by the developers when we try to assign any larger data type
		 * 	  to the smaller. We have to explicitly say to which smaller type we wish to convert it to.
		 *    
		 */
		// Case 1: Implicit casting
		
		int x = 100; //4 bytes
		long l = x; // implicit (long is of 8 bytes)
		
		System.out.println("l = " + l);
		
		double d = x;
		System.out.println("d = " + d);
		
		float f = l; //implicit (decimals are larger than the normal values)
		System.out.println("f = " + f);
		
		char c = 'M';
		System.out.println("c = " + c);
		
		x = c; // implicit, x is of 4 bytes but c is of 2 bytes
		System.out.println("smaller x: " + x);
		
		// Case 2: Explicit casting
		
		int d1 = 99;
		char z = (char)d1;
		
		System.out.println("z = " + z);
		
		float t = 88.77f;
		System.out.println("t = " + t);
		
		d1 = (int)t;
		System.out.println("d1 = " + d1);
		
		// We will do lots of object casting
		
	}
}
	
