package day19;
//in linkedhASHSET,IT MAINTAINS the insertion order and it permits null values
import java.util.*;
public class LinkedHashsetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
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

		
	

