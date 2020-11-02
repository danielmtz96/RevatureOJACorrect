package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1233, "hello");
		hm.put(1233, "updates"); // update if the key is the same
		// any number of values can be null, but we can only have one null key
		hm.put(null, null);
		hm.put(1000, null);
		hm.put(1211,  null);
		hm.put(9999, "java");
		hm.put(9990, "java");
		hm.put(1999, "java");
		hm.put(2999, "jse");
		hm.put(5252, "hibernate");
		
		System.out.println("HashMap: " + hm);
		
		// can only update a value for a key, cannot 'update' a key
		
		System.out.println("\nLinkedHashMap maintains order of insertion");
		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(1233, "hello");
		lhm.put(1233, "updates"); // update if the key is the same
		// any number of values can be null, but we can only have one null key
		lhm.put(null, null);
		lhm.put(1000, null);
		lhm.put(1211,  null);
		lhm.put(9999, "java");
		lhm.put(9990, "java");
		lhm.put(1999, "java");
		lhm.put(2999, "jse");
		lhm.put(5252, "hibernate");
		
		System.out.println("LinkedHashMap: " + lhm);

		System.out.println("\nTreeMap:");
		Map<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
		
		tm.put(1233, "hello");
		tm.put(1233, "updates"); // update if the key is the same
		// any number of values can be null, but we can only have one null key
		tm.put(1000, null);
		tm.put(1211,  null);
		tm.put(9999, "java");
		tm.put(9990, "java");
		tm.put(1999, "java");
		tm.put(2999, "jse");
		tm.put(5252, "hibernate");
		
		System.out.println("TreeMap: " + tm);
		
		System.out.println("\nHashTable does not retain order of insertion:");
		Map<Integer, String> ht = new Hashtable<>();
		
		ht.put(1233, "hello");
		ht.put(1233, "updates"); // update if the key is the same
		// no null keys or values
		ht.put(9999, "java");
		ht.put(9990, "java");
		ht.put(1999, "java");
		ht.put(2999, "jse");
		ht.put(5252, "hibernate");
		
		System.out.println("HashTable: " + ht);
		
		System.out.println(ht.size());
		System.out.println("ht.get(1000): " + ht.get(1000)); // if key is not there, prints null
		System.out.println("ht.get(1000): " + ht.get(5252));
		
		System.out.println("ht.containsKey(1000): " + ht.containsKey(1000));
		System.out.println("ht.containsKey(5252): " + ht.containsKey(5252));
		System.out.println("ht.containsValue(\"java\"): " + ht.containsValue("java"));
		System.out.println("ht.containsValue(\"jme\"): " + ht.containsValue("jme"));
		
		
		ht.remove(5252);
		System.out.println("ht: " + ht);
		
		// reading: 
		System.out.println("HashTable keys: " + ht.keySet());
		System.out.println("HashTable values: " + ht.values());
		
		// iterating
		Set<Integer> hs = ht.keySet(); // copy and write...
		for (Integer i: hs) {
			System.out.println("key = " + i + " value: " + ht.get(i));
		}
		
		// iterating: entrySet method
		
		System.out.println("\nentrySet method: ");
		for (Entry<Integer, String> e: ht.entrySet()) {  // if you don't import mava.util.Map.Entry, you have to
			// write: for(Map.Entry<Integer, String>)
			System.out.println("Key: " + e.getKey() + " value: " + e.getValue());
		}
		
		
	}
}
