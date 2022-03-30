package day12;

import java.util.*;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		sample.set(2, "renault"); // to modify values
		for(String car:sample) {
			System.out.println(car);
		}
	}

}
