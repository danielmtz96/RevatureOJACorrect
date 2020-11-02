package eg1;

import java.util.LinkedList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import java.util.Iterator;


public class Demo1 {
	public static void main(String[] args) {
		
		List li = new LinkedList();  // if you don't specify, you will insert Object... which can cause
		// issues when retrieving information. Correct syntax: List<type> li = new LinkedList<>();
		li.add("hello!");
		li.add(1211111);
		li.add(true);
		li.add('d');
		li.add(1233.4455f);
		System.out.println(li);
		
		// RHS should be its implementing class
		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(121);
		list1.add(null);
		list1.add(121);
		list1.add(null);
		list1.add(null);
		list1.add(44);
		list1.add(12);
		list1.add(123);
		list1.add(123);
		list1.add(123);

		
		// insertion at the end
		list1.add(55);
		System.out.println("list1: " + list1);
		
		// insertion at specific position
		System.out.println("\nInsertion at specific position:" );
		list1.add(1, 66);
		System.out.println("list1: " + list1);
		
		
		// update
		list1.set(3,  77);
		System.out.println("\nupdating list1:");
		System.out.println("list1: " + list1);
		
		// delete
		//list1.remove(77); // index, IndexOutOfBoundsException
		list1.remove(1);
		System.out.println("list1: " + list1);
		
		// remove is also overloaded
		Integer i = 123;
		list1.remove(i); // removes first occurrence of that object value
		System.out.println("\nlist1 after deleting values");
		System.out.println("list1: " + list1);
		
		// remove all occurrences
		while(list1.remove(i)) {}
		System.out.println("After removing all values");
		System.out.println("list1: " + list1);
		
		System.out.println("list1.get(3): " + list1.get(3)); // should be the same as ar[3]
		System.out.println("list1.size():" + list1.size());
		
		System.out.println("list1.contains(100): " + list1.contains(100));
		System.out.println("list1.contains(44): " + list1.contains(44));
		
		
		// for loop
		
		for (int j = 0; j < list1.size(); j++) {
			System.out.println(list1.get(j));
		}
		
		System.out.println("\n");
		
		for (Integer i2: list1) {
			System.out.println(i2);
		}
		
		List<Integer> list2 = new Vector<>(list1);
		System.out.println("list2: " + list2);
		
		list2.addAll(list1);
		System.out.println("list2: " + list2);
		
		list2.add(33);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		
		//list2.retainAll(list1);//common between list2 and list1, and result will be stored in list2.
		list2.removeAll(list1);
		System.out.println("\nlist2 new: " + list2);
		
		
		// Helper class: Collections
		System.out.println("list 1: " + list1);
		Collections.reverse(list1);   //reverse
		System.out.println("list 1: " + list1);
		Collections.shuffle(list1);   // shuffle
		System.out.println("list1: " + list1);
		
		Collections.replaceAll(list1, null, -1);
		
		//Collections.sort(list1);   method is overloaded!
		Collections.sort(list1, Collections.reverseOrder()); // it will throw NPE if I have null values inside the list
		System.out.println("list 1: " + list1); // NullPointerException
		
		
		// binary search: should be sorted in ascending order
		
		Collections.sort(list1);
		System.out.println("list1: " + list1);
		System.out.println("index of 100: " + Collections.binarySearch(list1, 100));   // negative value if value is not there
		System.out.println("index of -1: " + Collections.binarySearch(list1, -1));   // negative value if value is not there

		System.out.println("index of 77: " + Collections.binarySearch(list1, 77));   // negative value if value is not there
		
		System.out.println("\nPrinting list elements using iterator:");
		Iterator<Integer> i2 = list1.iterator();
		while (i2.hasNext()) {  // here we don't need to update like we do in maps (see maps-demo/eg_iterator/Demolterator.java)
			System.out.println(i2.next());
		}
		
		


	}
}
