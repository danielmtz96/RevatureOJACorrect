package egutility;

import java.util.Arrays;

public class ArrayUtilDemo {
	public static void main(String[] args) {
		
		int ar[] = { 22, 11, 22, 33, 11, 22, 11, 227888, 456 };
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		// for calling binary search, your array should and must be sorted in ascending order only
		// if search element is found, it will print 0 or positive value
		// if it is not found: then it will print a negative value
		System.out.println("Arrays.BinarySearch(ar,100): " + Arrays.binarySearch(ar, 100));
		System.out.println("Arrays.BinarySearch(ar,33): " + Arrays.binarySearch(ar, 33));
		
		// copy contents of one array to another array
		
		System.out.println("\nCopying contents of original ar");
		int ar2[] = Arrays.copyOf(ar,  ar.length+10);
		System.out.println(Arrays.toString(ar2));
		
		System.out.println("\nArray 3");
		int ar3[] = new int[10];
		System.out.println(Arrays.toString(ar3));
		Arrays.fill(ar3,  -22);
		System.out.println(Arrays.toString(ar3));
		
		// fill is overloaded
		System.out.println("\nOverloaded fill");
		Arrays.fill(ar3, 2, 5, -1000); // left is first desired index, and right is last desired index, exclusive
		System.out.println(Arrays.toString(ar3));
		

	}
}
