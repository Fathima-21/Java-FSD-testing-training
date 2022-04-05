package day18;
import java.util.Iterator;
import java.util.Stack;
public class StackIterationExample1 {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		stk.push("BMW");
		stk.push("audi");
		stk.push("ferrari");
		stk.push("bugatti");
		stk.push("jaguar");
		Iterator<String> iterator=stk.iterator();
		while(iterator.hasNext()) {
			Object value=iterator.next();
			System.out.println(value);
		}
	}

}
