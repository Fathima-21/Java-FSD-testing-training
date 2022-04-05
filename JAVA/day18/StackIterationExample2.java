package day18;
import java.util.Stack;
import java.util.Iterator;
public class StackIterationExample2 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(119);
		stk.push(203);
		stk.push(988);
		System.out.println("iteration over stack using forEach() method");
		stk.forEach(n->
		{
			System.out.println(n);
		});
	}

}
