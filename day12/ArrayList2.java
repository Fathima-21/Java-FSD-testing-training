package day12;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		// traversing list through iterator
		Iterator itr=sample.iterator();  // getting the iterator
		while(itr.hasNext()) {      // check if iterator has elements
			System.out.println(itr.next());    //   printing the element move to next
		}
		
	}

}
