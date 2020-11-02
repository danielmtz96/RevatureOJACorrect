package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("hello");
		hs.add("java");
		hs.add("null");
		hs.add("hibernate");
		hs.add("jme");
		hs.add("jee");
		hs.add("spring");
		hs.add("python");
		hs.add("php");
		System.out.println("HashSet: " + hs);
		
		Set<String> lhs = new LinkedHashSet<>(); // right hand side is implementing class
		// preserves order of insertion
		lhs.add("hello");
		lhs.add("java");
		lhs.add("null");
		lhs.add("hibernate");
		lhs.add("jme");
		lhs.add("jee");
		lhs.add("spring");
		lhs.add("python");
		lhs.add("php");
		System.out.println("LinkedHashSet: " + lhs);
		
		//Set<String> ts = new TreeSet<>(); //A-Z
		Set<String> ts = new TreeSet<>(Collections.reverseOrder());
		// can't add null to it
		ts.add("hello");
		ts.add("java");
		ts.add("null");
		ts.add("hibernate");
		ts.add("jme");
		ts.add("jee");
		ts.add("jee"); // this next element is ignored. no exception!
		ts.add("spring");
		ts.add("python");
		ts.add("php");
		System.out.println("TreeSet: " + ts);
		
		System.out.println("ts.size():" + ts.size());
		System.out.println(ts.contains("hey"));
		System.out.println(ts.contains("hello"));
		ts.remove("jme");
		System.out.println("ts: " + ts);
		
		System.out.println("\nPrinting out elements in tree set:");
		for (String s: ts) { // cannot use indices, so no get method. can only iterate over the elements.
			System.out.println(s);
		}
	}
}
