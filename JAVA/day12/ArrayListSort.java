package day12;

import java.util.*;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		Collections.sort(sample);
		for(String car:sample) {
			System.out.println(car);
		}
		System.out.println("element at 0: "+sample.get(0));
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(45);
		list2.add(30);
		list2.add(20);
		list2.add(15);
		list2.add(50);
		list2.add(10);
		Collections.sort(list2);
		for(Integer num:list2) {
			System.out.println(num);
		}
	}

}
