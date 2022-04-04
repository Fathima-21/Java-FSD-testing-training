package day18;
import java.util.*;
public class Hashtable3 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(100, "amit");
		hm.put(102, "ravi");
		hm.put(101,"vijay");
		hm.put(103,"rahul");
		// we specify if and else statement as arguments of method
		System.out.println(hm.getOrDefault(101,"not found"));
		System.out.println(hm.getOrDefault(105, "element is not found"));
		
	}

}
