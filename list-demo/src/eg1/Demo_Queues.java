package eg1;
import java.util.*;

public class Demo_Queues {
	public static void main(String[] args) {
		
		// create queue from linkedlist
		Queue<Integer> myqueue = new LinkedList<>();
		
		// add to queue
		myqueue.add(5);
		myqueue.add(15);
		myqueue.add(33);
		myqueue.add(1);
		myqueue.add(11);
		myqueue.add(7);
		
		System.out.println("Built queue: " + myqueue);
		
		// delete from queue. Expect the first element to be removed.
		myqueue.remove();
		System.out.println("Queue with 1 element removed: " + myqueue);
		
		// no implementation to insert/delete at specific locations within the queue
		
		// view the first element in the queue, the head of the queue
		int next_elem = myqueue.peek();
		System.out.println("First element in queue: " + next_elem);
		
		// print the size of the queue:
		System.out.println("Queue size: " + myqueue.size());
		
		// is the integer x in the queue?
		int x = 10;
		System.out.println(x + " is in Queue: " + myqueue.contains(x));
		
		// throw out and return the first element in the queue:
		
		int first_element_thrown = myqueue.poll();
		System.out.println("First element thrown: " + first_element_thrown);
		System.out.println("Queue now: " + myqueue);
		
		// iterate over the queue to print out its contents
		for (Integer i: myqueue) {
			System.out.println("i = " + i);
		}
		// empty the queue
		myqueue.clear();
		System.out.println("Empty queue: " + myqueue);
		
		// is the queue empty:
		System.out.println("The queue is empty. " + myqueue.isEmpty());
		
		// adding multiple elements to the queue using Arrays.asList
		
		myqueue.addAll(Arrays.asList(3, 4, 5));
		System.out.println("Queue contents: " + myqueue);
				
		
		// pure priority queue
		
		System.out.println("\nTesting with pure priority queue");
		PriorityQueue<String> mypq = new PriorityQueue<>();
		mypq.add("C");
		mypq.add("O");
		mypq.add("D");
		mypq.add("X");
		System.out.println("Priority queue: " + mypq);
		// remove an item from the priority queue:
		
		mypq.remove();
		System.out.println("Priority queue: " + mypq);
	
		// the priority queue has many methods in common with the Queue generated from the Linkedlist,
		// except that the pq has a comparator method for ordering.
	
		System.out.println("Comparator method: " + mypq.comparator());
		
		
		// create queue from priority queue child class
		
		System.out.println("\nTesting with Queue from implicit casting - priority queue");
		Queue<String> mysemipq = new PriorityQueue<>();
		// populating queue
		mysemipq.add("this");
		mysemipq.addAll(Arrays.asList("is", "a", "different", "type", "of", "queue"));
		System.out.println("mysemipq: " + mysemipq);
		// ordering is not the same as ordering of insertion
		
		String s = mysemipq.element();
		
		// return the element at the 'top' of the container
		// this method was also available for the queue from linkedlist
		String top_elem = mysemipq.element();
		System.out.println("top element in queue: " + top_elem);
		System.out.println("mysemipq: " + mysemipq);

		// remove an element from queue
		mysemipq.remove();
		System.out.println("mysemipq: " + mysemipq);
		// first and last element removed!
		
		// removing a specific element within the priority queue
		mysemipq.remove("type");
		System.out.println("mysemipq: " + mysemipq);

		
		// peek, looks at first value but does not return anything
		System.out.println("mysemipq.peek(): " + mysemipq.peek());
		
		// poll returns the first element in the queue and also removes it from the queue
		System.out.println("mysemipq.poll(): " + mysemipq.poll());
		
		System.out.println("mysemipq: " + mysemipq);
		
		// unique method for priority queues: spliterator
		Spliterator<String> spltr = mysemipq.spliterator();
		System.out.println("Spliterator result: " + spltr);
		
		//get size of queue
		System.out.println("mysemipq.size(): " + mysemipq.size());
		
		System.out.println("\nDeeueue from LinkedList");
		
		// Dequeue
		Deque<Integer> deque = new LinkedList<Integer>();
		// building up deque
		deque.add(3);
		System.out.println("Dequeue: " + deque);
		deque.addAll(Arrays.asList(10, 7, 11, 19, 13, 20));
		System.out.println("Dequeue: " + deque);
		// same order in which elements were added
		
		//adding element at first location
		deque.addFirst(1);
		
		//adding element at last location
		deque.addLast(100);
		
		System.out.println("Dequeue: " + deque);
		
		// containsAll method (also available in other queue types)
		int first_int = 7;
		int second_int = 10;
		int third_int = 2;
		
		System.out.println("Dequeue contains the integers: [" + first_int + ", " + second_int + ", " + third_int + "] " +
				deque.containsAll(Arrays.asList(first_int, second_int, third_int)));
		
		System.out.println("First item in deque: " + deque.getFirst());
		System.out.println("Last item in deque: " + deque.getLast());
		
		// offer method, similar to add
		
		deque.offer(15);
		System.out.println("Dequeue: " + deque);
		
		deque.remove(); // this just removes the first element in the deque
		System.out.println("Dequeue: " + deque);
		
		deque.remove(7); // removes integer 7 in deque, works the same as removeFirstOccurrence
		System.out.println("Dequeue: " + deque);
		
		deque.add(20);
		System.out.println("Dequeue: " + deque);
		
		deque.remove(20);
		System.out.println("Dequeue: " + deque);
		
		deque.push(5); // pushed to beginning of deque
		System.out.println("Dequeue: " + deque);
		
		deque.pop(); // removes first element in deque
		System.out.println("Dequeue: " + deque);
		
		// size of deque
		System.out.println("deque.size(): " + deque.size());


		
		
	}
}
