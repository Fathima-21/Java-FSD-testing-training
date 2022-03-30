package day19;
//in hashset,elements are unique
import java.util.*;
public class HahsetExample {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
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
