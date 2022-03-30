package day18;
import java.util.Stack;
public class StackSizeMethodExample {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(22);
		stk.push(33);
		stk.push(44);
		stk.push(55);
		stk.push(66);
		// checking whether stack is empty or not
		boolean result=stk.empty();
		System.out.println("is stack empty:"+result);
		int x=stk.size();
		System.out.println("stack size:"+x);
	}

}
