package eg1;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "heyy";
		
		System.out.println("s1hashCode(): " + s1.hashCode());
		System.out.println("s2hashCode(): " + s2.hashCode());
		System.out.println("s3hashCode(): " + s3.hashCode());
		
		System.out.println("\nSystem identity hashCode: ");
		System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2));
		System.out.println("System.identityHashCode(s3): " + System.identityHashCode(s3));

		
		System.out.println("\nstrings:");
		System.out.println("string 1: " + s1);
		System.out.println("string 2: " + s2);
		System.out.println("string 3: " + s3);
		System.out.println("string 4: " + s4);
        System.out.println("\nstring1.equals(string2): ");
		System.out.println("s1.equals(s3): " + s1.equals(s3));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("s1.equals(s4): " + s1.equals(s4));
		
		System.out.println("\nEquals ignore case:");
		System.out.println("s1.equalsIgnoreCase('HeLlo'): " + s1.equalsIgnoreCase("HeLlo"));
		System.out.println("s1.equals('HeLlo'): " + s1.equals("HeLlo"));
		
		System.out.println("\nlength and charAt:");
		System.out.println("s1.length(): " + s1.length());
		System.out.println("s1.charAt(0): " + s1.charAt(0));
		
		System.out.println("\nPrinting an array: ");
		char c[] = s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("\nsubsequences and characters");
		System.out.println("s1.substring(1): " + s1.substring(1));
		System.out.println("s1.substring(2, 4): " + s1.substring(2, 4));
		
		System.out.println("s1.contains(\"e\"): " + s1.contains("e"));
		System.out.println("s1.contains(\"llo\"): " + s1.contains("llo"));
		System.out.println("s1.contains(\"lol\"): " + s1.contains("lol"));
		
		System.out.println("\nSplitting array and printing with loop");
		String s5 = "hello hi good morning. have a wonderful day ahead";
		String s6[] = s5.split(" ");
		
		for(String s: s6) {
			System.out.println(s.toUpperCase());
		}
		
		System.out.println("\nImmutability property");
		System.out.println(s5.toUpperCase());
		System.out.println("s5: " + s5);
		System.out.println("\nThe only way to modify a string is: ");
		s5 = s5.toUpperCase();
		System.out.println("new s5: " + s5);
		
		String s7 = "              heyy                ";
		System.out.println("s7: " + s7);
		s7 = s7.trim();
		System.out.println("new s7: " + s7);
	
	}
}
