package day20;
// java program for implementing iteration of elements in deque
import java.util.*;
public class DequeIteration {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("to");
		dq.addFirst("WELCOME");
		dq.addLast("java");
		dq.add(",the best programming language");
		//iterating using for loop
		for(Iterator itr=dq.iterator();itr.hasNext();) {
			System.out.println(itr.next()+" ");
			
		}
		System.out.println();
		// iterating in descending order
		for(Iterator itr=dq.descendingIterator();itr.hasNext();){
			System.out.println(itr.next()+" ");
			
		}
	}

}
