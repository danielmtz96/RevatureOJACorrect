package eg1;

public class Palindrome {
	public static void main(String[] args) {
		String s = "madam";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if (s.equals(s1)) {
			System.out.println("Yes, it is a Palindrome");
		} else {
			System.out.println("Nope, not a Palindrome");
		}
		
		// more efficient implementation
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		int x = 101;
		s = x + "";
		if (new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Palindrome INT");
		} else {
			System.out.println("Not Palindrome INT");
		}
	}
}
