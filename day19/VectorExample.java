package day19;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("ayush");
		v.add("amit");
		v.add("ashish");
		v.add("garima");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
//property:vector is synchronized
