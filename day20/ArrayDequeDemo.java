package day20;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
		// initializing a deque
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("to");
		dq.addFirst("WELCOME");
		dq.addLast("java");
		System.out.println(dq);
		System.out.println(dq.element());
		System.out.println(dq.poll());
		dq.push("amazing");
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
	}

}
