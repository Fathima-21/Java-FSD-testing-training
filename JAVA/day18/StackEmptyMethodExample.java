package day18;

import java.util.Stack;
public class StackEmptyMethodExample {

	public static void main(String[] args) {
		// creating an instance of Stack class
		Stack<Integer> stk=new Stack<Integer>();
		// checking stack is empty or not
		boolean result=stk.empty();
		System.out.println("Is stack empty:"+result);
		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		// printing elements in stack
		System.out.println("elements in stack:"+stk);
		result=stk.empty();
		System.out.println("Is stack empty:"+result);
		
	}

}
