package eg1;

public class Demo1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("sb = " + sb);
		System.out.println("\nAppending strings to string buffer");
		sb.append(" hello").append(" hey").append(" java").append("12331266666");
		System.out.println(sb);
		
		System.out.println("\nInserting string at position 1");
		sb.insert(1,  "Hibernate");
		System.out.println(sb);
		
		System.out.println("\nDeleting characters at positions 2, 3, 4");
		sb.delete(2, 5); // delete 2, 3, and 4
		System.out.println(sb);
		
		System.out.println("\nDeleting first string");
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		System.out.println("\nReversing (and mutating) string");
		System.out.println(sb.reverse()); // this line modifies the string, because sb is mutable!
		System.out.println(sb);
		
		System.out.println("\nStringBuffer compares addresses");
		StringBuffer sb1 = new StringBuffer("vinay");
		StringBuffer sb2 = new StringBuffer("vinay");
		System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // but this is false!
		
		// how do we check the data?
		// convert to string
		
		System.out.println("\nConvert stringbuffers to strings to compare contents!");
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	}
}
