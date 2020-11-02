package eg1;

public class Demo1 {
	public static void main(String[] args) {
	/* Primitive data types
	 * datatype				size(bytes)				defaultValue
	 * ---------------------------------------------------------
	 * byte						1byte 					0
	 * short					2						0
	 * int						4						0
	 * long						8						0
	 * 
	 * float					4						0.0000f
	 * double					8						0.0000d
	 * (any decimal values in java by default it considers as double)
	 * 
	 * char						2						'\u0000' UNI-code character set
	 * boolean					1 bit					false
	 
	 String is not a data type -- it's a class! Rule of thumb: anything with upper case letters is a class
	 */
	int x = 10; // primitive type int with 4 bytes of memory holding the value 10
	System.out.println("x = " + x);
	
	float f1 = 12.3f;
	System.out.println("f1 = " + f1);
	
	double d1 = 22.333d;
	System.out.println("d1 = " + d1);
	
	long contact = 123456789L;
	System.out.println("contact : " + contact);
	
	boolean b = false;
	System.out.println("boolean : " + b);
	
	String s = "Hello String"; // s object of String class points to the memory address of the message "Hello String"
	// s does not hold the actual message (objects never hold anything)
	
	System.out.println("String = " + s);
	
	char c = 'H';  // characters use single quotes
	System.out.println(c);
	}
}
