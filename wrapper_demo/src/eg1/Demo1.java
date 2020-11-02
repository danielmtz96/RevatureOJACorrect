package eg1;

public class Demo1 {
	public static void main(String[] args) {
		
		Integer i1 = 8;
		Integer i2 = 8;
		Integer i3 = new Integer(8);
		Integer i4 = 5;
		
		System.out.println("i1 == i2 " + (i1 == i2));
		System.out.println("i1 == i3 " + (i1 == i3));
		System.out.println("i1 == i4 " + (i1 == i4));
		
		// comparing data
		System.out.println("\nComparing data");
		System.out.println("i1.equals(i2) = " + i1.equals(i2));
		System.out.println("i1.equals(i3) = " + i1.equals(i3));
		System.out.println("i1.equals(i4) = " + i1.equals(i4));
		
		int x = 100;
		Integer i5 = x; // Autoboxing
		
		System.out.println("x: " + x);
		System.out.println("i5: " + i5);
		
		i5 = 99;
		System.out.println("x: " + x);
		System.out.println("i5: " + i5);
		
		System.out.println("\nInteger max value:" + Integer.MAX_VALUE);
		System.out.println("\nLong.MAX_VALUE: " + Long.MAX_VALUE);
		System.out.println("\nInteger min value: " + Integer.MIN_VALUE);
		
		String s = "120";
		Integer i6 = Integer.parseInt(s); //WrapperClass.parseXyZ(stringobject); apart from Character class
	    System.out.println("i6: "+ i6);
	    
	    i6 = 999999;
	    s = i6.toString();  
	    System.out.println("\ns = " + s);
	    
	    int z = 9898989;
	    s = z + ""; // anything in java can be converted to a String object by appending with "" 
	    System.out.println("s = " + s);
	    //s2 = z.toString(); can't do .toString on primitives
	    
	    Integer i7 = 10;
	    System.out.println("\ni7.compareTo(10): " + i7.compareTo(10));
	    System.out.println("\ni7.compareTo(100): " + i7.compareTo(100));
	    System.out.println("\ni7.compareTo(0): " + i7.compareTo(0));
	    
	    
	    // convert to binary
	    
	    System.out.println("\n20 in binary: " + Integer.toBinaryString(20));
	    System.out.println(Integer.toHexString(20));
	    System.out.println(Integer.toOctalString(20));
	    
	    // converting double, float, long to binary
	    System.out.println("\n 'Assignment'");
	    Float f = i7.floatValue(); //instead of doing casting
	    System.out.println("f = " + f);
	    f = 88.77f;
	    int m = f.intValue();
	    System.out.println("m = " + m);
	    
	    // Long to stuff
	    
	    System.out.println("\nConverting Long");
	    Long long_num = 10L;
	    System.out.println("Long: " + long_num);
	    System.out.println("Long to binary: " + Long.toBinaryString(long_num));
	    System.out.println("Long to hexstring: " + Long.toHexString(long_num));
	    System.out.println("Long to oct string: " + Long.toOctalString(long_num));
	    
	    System.out.println("\nConverting float");
	    Float test_float = 1.0f;
	    int float_bits = Float.floatToIntBits(test_float);
	    System.out.println("Float to binary: " + Integer.toBinaryString(float_bits));
	    System.out.println("Float to hex: " + Float.toHexString(test_float));
	    
	    
	    System.out.println("\nConverting double");
	    Double double_num = 1.0d;
	    System.out.println("Double: " + double_num);
	    long double_bits = Double.doubleToRawLongBits(double_num);
	    System.out.println("Double to binary: " + Long.toBinaryString(double_bits));
	    
	    



	}
}
