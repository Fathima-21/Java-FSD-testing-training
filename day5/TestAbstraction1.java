package day5;

// abstract class can have constructor,regular methods,abstract methods.
// abstract methods should be implemented

abstract class Bike{
	Bike(){
		System.out.println("bike constructor is invoked");
	}
	void run() {     // regular method
		System.out.println("bike is running");
		
	}
	abstract void display();    // abstract method
}
class Suzuki extends Bike{
	void run() {
		System.out.println("suzuki is running");
	}
	void display() {    // abstract method is being is implemented
		System.out.println("suzuki is a top tier bike");
	}
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		Bike obj=new Suzuki();
		obj.run();
		obj.display();
		
	}

}
