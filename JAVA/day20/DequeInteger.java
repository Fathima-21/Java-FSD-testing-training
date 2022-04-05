package day20;
//Java program to demonstrate the creation of deque object using the ArrayDeque class in Java
import java.util.*;
public class DequeInteger {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		//clear mehod
		dq.clear();
		dq.addFirst(564);
		dq.addFirst(291);
		dq.addLast(24);
		dq.addLast(14);
		System.out.println(dq);
	}

}
