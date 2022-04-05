package day12;

import java.util.*;

// retainall()

public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ravi");
		al2.add("hanumat");
		al.retainAll(al2);
		System.out.println(al);
		System.out.println("iterating elements after retaining the elements of al2");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
