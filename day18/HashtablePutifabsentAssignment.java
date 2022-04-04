package day18;

import java.util.Hashtable;
import java.util.Map;

public class HashtablePutifabsentAssignment {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(1, "fathima");
		hm.put(2, "atheena");
		hm.put(31,"noobi");
		hm.put(4,"arunima");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(56, "jeenabai");
		System.out.println(hm);
	}

}
