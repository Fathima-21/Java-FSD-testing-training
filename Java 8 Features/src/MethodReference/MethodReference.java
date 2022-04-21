package MethodReference;

interface Sayable{
	void say();
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("hello,this is static method");
	}

	public static void main(String[] args) {
		// referring static method
		Sayable sayable=MethodReference::saySomething;
		//calling interface method
		sayable.say();
		
	}

}
