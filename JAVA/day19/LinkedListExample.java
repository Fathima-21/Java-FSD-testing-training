package day19;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ravi");
		al.add("ajay");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); // printed in same order of insertion
		}
	}

}
// property:can store duplicate values
