package day18;
import java.util.*;
public class Hashtable2 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(100, "amit");
		hm.put(102, "ravi");
		hm.put(101,"vijay");
		hm.put(103,"rahul");
		System.out.println("before remove:"+hm);
		hm.remove(102);
		System.out.println("after remove:"+hm);
		
		
	}

}
