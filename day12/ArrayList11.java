package day12;
import java.util.*;

public class ArrayList11 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		list.add("vijay");
		list.add("arun");
		list.add("ajay");
		System.out.println("traversing list through List iterator");
		//  here element iterates in reverse order
		ListIterator<String> itr=list.listIterator(list.size());
		while(itr.hasPrevious()) {
			String str=itr.previous();
			System.out.println(str);
		}
		// traversing loop through forloop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("traversing list through forEach method");
		// forEach() is a new feature introduced in java 8
		list.forEach(a->{
			System.out.println(a);
		}
		);
		System.out.println(" ");
		System.out.println("traversing list through forEachRemaining method");
		Iterator<String> itr1=list.iterator();
		itr1.forEachRemaining(a->  // here we are using lambda expression
		{
			System.out.println(a);
		});
		
	}

}
