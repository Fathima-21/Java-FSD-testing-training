package day12assignment;
import java.util.*;
public class AverageArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		double sum=0;
		for(int i:list) {
			sum+=i;
		}
		double average=sum/list.size();
		System.out.println("sum "+sum);
		System.out.println("average = "+average);
	}

}
