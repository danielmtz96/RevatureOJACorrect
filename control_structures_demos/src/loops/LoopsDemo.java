package loops;

public class LoopsDemo {
	public static void main(String[] args) {
		// loops: perform a task a various number of times
		
		for (int i = 0; i < 11; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("\nTwo iteration variables");
		for (int i = 0, j = 10; i < 11; i++, j--) {
			System.out.println("i = " + i + "  j = " + j);
		}
		
		System.out.println("\nPrinting all even numbers between 1 to 50");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("i = " + i + " is a multiplier of 2.");
			}
		}
		
		int x = 0;
		System.out.println("\nx while loop");
		while (x != 10) {
			System.out.println("x = " + x);
			x++;
		}
		
		int m = 1;
		do {
			System.out.println("I will be executed once for sure");
		} while(m != 1);
		
		while(m != 1) {
			System.out.println("I will be executed iff the m is value is != 1");
		}
	}
}
