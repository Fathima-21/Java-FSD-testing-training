package Lambda;
interface MyInterface{
	public void myMethod();
}
public class LambdaExpressionEx {

	public static void main(String[] args) {
		int variable=10;
		//implementation with lambda expression
		MyInterface myInterface= ()->{
			System.out.println("variable="+variable);
		};
		myInterface.myMethod();
		
	}

}
