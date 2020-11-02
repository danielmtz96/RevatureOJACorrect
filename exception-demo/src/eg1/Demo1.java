package eg1;

public class Demo1 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 2;
		int res = 0;
		
		try {
		res = x/y;
		System.out.println(args[0]);
		String s = null;
		System.out.println(s.length());   // can also have a null pointer exception, which is not caught until
		// 2nd catch block
		// catch(Exception e) here will make code become unreachable. The code will not be able to handle
		// arithmetic or null pointer exceptions. Write as last catch block.
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		} catch(NullPointerException e) {
			System.out.println("Something is null here");
		} 
		catch(Exception e) {
			System.out.println("Some other exception occurred: " + e);
		}	finally { //suppose you want to print out the result, regardless of what happens
			System.out.println("Result is: " + res);
		}
		
		System.out.println("Remaining lines of code in this app");
	}
}
