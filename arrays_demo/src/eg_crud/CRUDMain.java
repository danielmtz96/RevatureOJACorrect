package eg_crud;

public class CRUDMain {
	public static void main(String[] args) {
		int ar[] = new int[10];
		ar[0] = 111;
		ar[1] = 2;
		ar[2] = 77;
		ar[3] = 4;
		ar[4] = 33;
		ar[5] = 100;
		
		// array with unassigned values
		// unassigned locations are set to default 0
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " "); // use print, not println, to print all on the same line
		}
		
		// fix algorithm
		int n = 6;
		int pos = 3;
		int value = 99;
		for (int i = n; i >= pos; i--) {
			ar[i] = ar[i-1];
		}
		ar[pos - 1] = value;
		// inserting: increase size of n
		n++;
		
		System.out.println("\n\nPrinting array contents after insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		
		// deleting from array
		int delpos = 5;
		for (int i = delpos - 1; i < n; i++) {
			ar[i] = ar[i+1];
		}
		// deleting: decrease size of n
		n--;
		System.out.println("\n\nDeleting at a location");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] +  " ");
		}
		
	}
}
