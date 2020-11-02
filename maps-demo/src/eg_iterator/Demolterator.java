package eg_iterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demolterator {
	public static void main(String[] args) {
		// remove all K-V pairs whose key is multiples of 10 or whose value is null;
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1233, "hello");
		hm.put(1230, "updates"); // update if the key is the same
		// any number of values can be null, but we can only have one null key
		hm.put(4000, null);
		hm.put(1211,  null);
		hm.put(1000, null);
		hm.put(1211,  null);
		hm.put(9999, "java");
		hm.put(9990, "java");
		hm.put(1999, "java");
		hm.put(2999, "jse");
		hm.put(5252, "hibernate");
		
		System.out.println("Before deletion: ");
		System.out.println(hm);
		
		/*
		for(Entry<Integer, String> e:hm.entrySet()) {
			if(e.getKey()%10 == 0 || e.getValue() == null) {
				hm.remove(e.getKey()); // exception because you're trying to get the key and remove it
			}
		}
		// two objects trying to modify the same data results in ConcurrentModificationException
		
		System.out.println("After deletion: ");
		System.out.println(hm);
		
		*/
		
		//Enumerator -> read from top to bottom
		//Iterator -> read and remove from top to bottom
		//ListIterator -> add, read, remove, and is bidirectional but it is applicable only on list interface
		
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator(); // create new iterator object
		while(i.hasNext()) {
			Entry<Integer, String> e = i.next(); //read & increment
			// don't do i.next() twice. Make sure i.next() is only ONCE within the loop
			if(e.getKey()%10 == 0 || e.getValue() == null) {
				i.remove();  // removes from hm
			}
		}
		
		System.out.println("After deletion");
		System.out.println(hm);
	}
	
}
