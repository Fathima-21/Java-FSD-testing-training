package day18;
import java.util.*;
public class Hashtable4 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(100, "amit");
		hm.put(102, "ravi");
		hm.put(101,"vijay");
		hm.put(103,"rahul");
		System.out.println("initial map:"+hm);
		hm.putIfAbsent(104,"gaurav");
		System.out.println("updated map:"+hm);
		hm.putIfAbsent(101,"vijay");
		System.out.println("updated map:"+hm);
	}

}
