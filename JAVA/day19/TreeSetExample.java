package day19;
import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("ravi");
		set.add("vijay");
		set.add("ravi");
		set.add("ajay");
		// traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
		
	


