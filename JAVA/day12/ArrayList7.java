package day12;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		al.add("veerajay");
		al.add("gaurav");
		System.out.println("initial set of elements "+al);
		// removing specific element from arraylist
		al.remove("vijay");
		System.out.println(al);
		// removing element on the basis of specific position
		al.remove(0);
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ravi");
		al2.add("hanumat");
		//adding elements of al2 to al
		al.addAll(al2);
		System.out.println(al);
		al.add(1,"ravi");
		System.out.println(al);
		// removing all the elements of al2 from al
		al.removeAll(al2);
		System.out.println(al);
		
		// removing elements on the basis of specified condition
		
		al.removeIf(str->str.contains("ajay"));  // here we are using lambda expression
		System.out.println(al);
		
		// removing all the elements in the list
		al.clear();
		System.out.println(al);
		
		
		
	}

}
