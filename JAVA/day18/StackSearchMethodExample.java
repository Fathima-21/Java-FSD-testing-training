package day18;
import java.util.Stack;
public class StackSearchMethodExample {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		stk.push("mac book");
		stk.push("hp");
		stk.push("dell");
		stk.push("asus");
		System.out.println("stack:"+stk);
		int location=stk.search("hp");
		if(location>0) {
			System.out.println("hp is present at the position:"+location);
		}
		else {
			System.out.println("stack is empty");
		}
		
		
	}

}
