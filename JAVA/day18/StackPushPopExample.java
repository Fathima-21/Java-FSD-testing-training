package day18;
import java.util.*;
public class StackPushPopExample {
	
	// performing push operation
	static void push(Stack<Integer> stk,int x) {
		// invoking push method
		stk.push(x);
		System.out.println("push->"+x);
		// prints modified stack
		System.out.println("stack:"+stk);
	}
	// performing pop operation
	static void pop(Stack<Integer> stk) {
		System.out.println("pop->");
		// invoking pop method
		Integer x=stk.pop();
		System.out.println(x);
		// prints modified stack
		System.out.println("stack:"+stk);
		}
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		// pushing elements into the stack
		push(stk,90);
		push(stk,54);
		push(stk,74);
		push(stk,13);
		push(stk,78);
		push(stk,12);
		push(stk,36);
		System.out.println("stack elements are:"+stk);
		// popping elements
		pop(stk);
		pop(stk);
		try {
			pop(stk);
		}
		catch(EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
	

}
