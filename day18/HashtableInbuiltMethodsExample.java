package day18;
import java.util.*;
public class HashtableInbuiltMethodsExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(1, "fathima");
		hm.put(2, "atheena");
		hm.put(31,"noobi");
		hm.put(4,"arunima");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.remove(31);
		System.out.println("after remove:"+hm);
		System.out.println(hm.getOrDefault(1,"not found"));
		hm.putIfAbsent(56, "jeenabai");
		System.out.println(hm);
		boolean result=hm.contains(31);
		System.out.println("key 31 is present:"+result);
		result=hm.equals(89);
		System.out.println(result);
		System.out.println(hm.get(2));
		hm.replace(1,"saira");
		System.out.println(hm);
		System.out.println(hm.clone());
		System.out.println("hash code of map is.."+hm.hashCode());
		System.out.println("value at the key 56.."+hm.get(56));
		System.out.println("is hashtable empty..."+hm.isEmpty());
		System.out.println(hm.elements());
		System.out.println("whether value noobi present..."+hm.contains("noobi"));
		System.out.println("values in hashtable:"+hm.values());
		System.out.println("string representation of hashtable: "+hm.toString());
		System.out.println("enumeration of values in hashtable.."+hm.elements());
		System.out.println("enumeration of keys in hashtable:"+hm.keys());
		System.out.println("setview of keys in hashtable:"+hm.keySet());
		System.out.println("size of hashtable:"+hm.size());
		
		
		
		
		
	}

}
