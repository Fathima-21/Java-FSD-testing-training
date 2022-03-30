package day20;
import java.util.*;
public class DequeExample {
	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<>();
		// we can add elements to the queue in various ways
		// add at the last
		deque.add("element(1) tail");
		// add at the first
		deque.addFirst("element(2) head");
		// add at the last
		deque.addLast("element(3) tail");
		// add at the first
		deque.push("element(4) head");
		// add at the last
		deque.offer("element(5) head");
		// add at the first
		deque.offerFirst("element(6) head");
		System.out.println(deque+" \n ");
		// we can remove 1st element or last element
		deque.removeFirst();
		deque.removeLast();
		System.out.println("deque after removing"+" first and last:"+deque);
		
		
	}

}
