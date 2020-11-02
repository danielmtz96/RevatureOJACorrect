package loops;

public class NestedLoopsDemo {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("i = " + i + " j = " + j);
			}
		}
		
		System.out.println("\nPrinting all prime numbers between 1 and 50");
		for (int i = 1; i <= 50; i++) {
			int c = 0; // counter for number of times an integer is divisible by another integer, namely: by 1 and by itself
			for (int j = 1; j <= i; j++) {
				if (i % j ==0) {
					c++;
				}
			}
			if (c == 2) { // integer i is divisible by 1 and by itself
				System.out.println(i + " ");
			}
		}
	}
}
