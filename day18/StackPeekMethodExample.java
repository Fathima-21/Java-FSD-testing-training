package day18;
import java.util.Stack;
public class StackPeekMethodExample {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		stk.push("orange");
		stk.push("water melon");
		stk.push("pineapple");
		stk.push("apple");
		stk.push("banana");
		String fruit=stk.peek();
		System.out.println("element at the top:"+fruit);
		
	}

}
