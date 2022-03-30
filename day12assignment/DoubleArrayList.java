package day12assignment;

import java.util.*;

public class DoubleArrayList {

	public static void main(String[] args) {
		// CREATING ARRAYLIST OF TYPE DOUBLE
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(1.38);
		list.add(5.48);
		list.add(3.21);
		list.add(4.21);
		list.add(10.85);
		list.add(7.65);
		list.add(2.36);
		System.out.println("unsorted array list : "+ list);
		// sorting arraylist in descending order
		// using Collections.sort() method
		// by passing Collections.reverseOrder() as comparator
		Collections.sort(list,Collections.reverseOrder());
		// print the sorted arraylist
		System.out.println("Sorted arraylist in descending order : "+list);
	}

}
