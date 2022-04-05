package day20;
// java program to implement arraydeque in java
import java.util.*;
public class GGfG {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<Integer>(10);
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		// iterating using for each loop
		for(Integer element:dq) {
			// print the corresponding element
			System.out.println("element:"+element);
		}
		// using clear method
		System.out.println("using clear()");
		dq.clear();
		//addFirst() method
		// inserting at the start
		dq.addFirst(564);
		dq.addFirst(291);
		//addLast() method
		// inserting at the end
		dq.addLast(24);
		dq.addLast(14);
		// iterators
		System.out.println("elements of deque using iterator");
		for(Iterator itr=dq.iterator();itr.hasNext();) {
			System.out.println(itr.next());
		}
		// descending iterator
		// to reverse deque order
		System.out.println("elements of deque in reverse order");
		for(Iterator itr=dq.descendingIterator();itr.hasNext();) {
			System.out.println(itr.next());
		}
		// element method to return head element
		System.out.println("head element using element() method:"+dq.element());
		// getFirst()method to get head element
		System.out.println("head element using getFirst():"+dq.getFirst());
		// getLst() to get last element
		System.out.println("tail element using getLast()"+dq.getLast());
		// toArray() method
		Object[] arr=dq.toArray();
		System.out.println("array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
		// peek() method to get head
		System.out.println("head element:"+dq.peek());
		//poll() method to get head
		System.out.println("head element using poll method:"+dq.poll());
		// push method
		dq.push(265);
		dq.push(984);
		dq.push(2365);
		//remove() to get head
		System.out.println("head element remove:"+dq.remove());
		System.out.println("final array:"+dq);
		
		
		
		
		
	}

}
