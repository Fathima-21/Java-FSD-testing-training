package day19;
// in dequeue,we can insert or delete elements from both sides.but in queue,insertion only at one side and deletion from other side
import java.util.*;
public class DequeueExample {
	public static void main(String[] args) {
		Deque <String> dq=new ArrayDeque<String>();
		dq.add("gautam");
		dq.add("karan");
		dq.add("ajay");
		// traversing elements
		for(String str:dq) {
			System.out.println(str);
		}
		
	}

}
