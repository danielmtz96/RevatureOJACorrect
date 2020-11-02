package eg1;

public class Demo1 {
	public static void main(String[] args) {
		int ar[] = {22, 11, 22, 33, 11, 22, 33, 11, 22788, 456};
		
		System.out.println(ar[0]);
		
		// printing all items in the array
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		
		// enhanced for loop or for each loop... 
		for(int x :ar) {
			System.out.println(x);
		}
	}
}
