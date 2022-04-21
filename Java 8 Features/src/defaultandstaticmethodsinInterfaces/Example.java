package defaultandstaticmethodsinInterfaces;

interface MyInterface{
	default void newDefaultMethod() {
		System.out.println("new default method");
	}
	static void newStaticMethod() {
		System.out.println("new static method");
	}
	void existingMethod(String str);
}
public class Example implements MyInterface {
	//existing method implementation
	public void existingMethod(String str) {
		System.out.println("String:"+str);
	}
	//there is no need to implement the other methods
	public static void main(String[] args) {
		Example obj=new Example();
		obj.newDefaultMethod();
		MyInterface.newStaticMethod();
		obj.existingMethod("This is the new java 8 feature ");
		
	}

}
