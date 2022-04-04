package day18;
import java.util.*;
public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(100, "amit");
		hm.put(102, "ravi");
		hm.put(101,"vijay");
		hm.put(103,"rahul");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
