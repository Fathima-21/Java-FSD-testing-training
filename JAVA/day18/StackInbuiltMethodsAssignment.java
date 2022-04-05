package day18;
import java.util.Stack;
public class StackInbuiltMethodsAssignment {

	public static void main(String[] args) {
		Stack<String> animal=new Stack<String>();
		animal.push("dog");
		animal.push("cat");
		animal.push("tiger");
		animal.push("lion");
		animal.push("bear");
		animal.push("panda");
		System.out.println("stack:"+animal);
		animal.pop();
		animal.pop();
		System.out.println("stack:"+animal);
		String top=animal.peek();
		System.out.println("topmost element of stack:"+top);
		boolean result=animal.empty();
		System.out.println("is stack empty:"+result);
		System.out.println("stack size:"+animal.size());
		int location=animal.search("tiger");
		System.out.println("tiger is present at position:"+location);
	}

}
