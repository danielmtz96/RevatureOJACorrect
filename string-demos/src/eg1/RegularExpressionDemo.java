package eg1;

public class RegularExpressionDemo {
	public static void main(String[] args) {
		/* Regular Expression (RegEx) - used for pattern matching
		 * 	
		 * [] - expression
		 * {} - length
		 * ^ - not
		 * [a-z]{5} - any lower case word of length 5
		 * [0-9A-Z]{4} - any alphanumeric word of length 4 (alphas should be in upper case)
		 * [a-zA-Z]{2, 6} - any word of min length 2 and max length of 6
		 * [A-Z]{1, } - minimum 1 upper case letter
		 * [^0-9] - apart from digits
		 */
		
		System.out.println("Regex testing");
		String s = " H  E &** *LL  1 234Oa )  a199_";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^A-Z]", "")); // capital letters only
		System.out.println(s.replaceAll("[^0-9a-zA-Z]", "")); // remove special characters
		System.out.println(s.replaceAll("[^0-9]", "")); // numbers only
		System.out.println(s.replaceAll("[ 0-9a-zA-Z]", "")); // special characters only

		//A string which starts with 5 uppercase letters followed by 4 digits and an uppercase letter.
		String s1 = "ABCFZ5490F";
		System.out.print("\n");
		
		if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Validated.");
		} else {
			System.out.println("Not validated.");
		}
	}
}
