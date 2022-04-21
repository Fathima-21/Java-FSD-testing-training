package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuncInterfaceEx {
	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("printing whole list");
		// passing n as parameter
		eval(intList,n->true);
		System.out.println("printing even numbers:");
		eval(intList,n->n%2==0);
		}
	public static void eval(List<Integer>intList,
			Predicate<Integer> predicate)
	{
		for(Integer n:intList)
		{
			if(predicate.test(n)) {
				System.out.println(n+"");
			}
		}
	}

}
