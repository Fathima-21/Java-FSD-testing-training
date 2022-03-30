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
		
	}

}
