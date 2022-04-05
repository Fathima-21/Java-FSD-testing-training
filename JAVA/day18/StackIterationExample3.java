package day18;
import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class StackIterationExample3 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(119);
		stk.push(203);
		stk.push(988);
		System.out.println("STACK ITERATION using listiterator method from top to bottom");
		ListIterator<Integer> ListIterator=stk.listIterator(stk.size());
		while(ListIterator.hasPrevious()) {
			Integer avg=ListIterator.previous();
			System.out.println(avg);
		}
		
	}

}
