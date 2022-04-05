package day20;
import java.util.*;
public class DequeRemoving {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("to");
		dq.addFirst("WELCOME");
		dq.addLast("java");
		System.out.println(dq);
		System.out.println(dq.pop()); // deletes 1st element
		System.out.println(dq.poll()); // deletes first element
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		
	}

}
