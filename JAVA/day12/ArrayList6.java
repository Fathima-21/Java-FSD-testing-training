package day12;

import java.util.*;
public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("initial set of elements :"+al);
		// adding elements to the end of list
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		System.out.println("after invoking add(E e) method: "+al);
		// adding an element at the specific position
		al.add(1,"Gaurav");
		System.out.println("after adding add(int index,E element) method :"+al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("sonoo");
		al2.add("hanumat");
		al2.add("arun");
		al2.add("mahesh");
		// adding second list elements to first list
		al.addAll(al2);
		System.out.println("after invoking addAll(Collection<? extends E> c) method "+al);
		ArrayList<String> al3=new ArrayList<String>();
		al3.add("john");
		al3.add("rahul");
		al.addAll(1,al3);
		System.out.println(al);
		
		
	}

}
