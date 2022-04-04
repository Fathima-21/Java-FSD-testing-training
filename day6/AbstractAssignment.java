package day6;

abstract class Vehicle{
	void car() {
		System.out.println("car is running");
	}
		abstract void train();
		abstract void bike();
	}
	

class Vehicle1 extends Vehicle{
	void car() {
		System.out.println("my car got punctured");
	}
	void train() {
		System.out.println("train is running");
	}
	void bike() {
		System.out.println("bike is running");
	}
}

public class AbstractAssignment {

	public static void main(String[] args) {
		Vehicle v=new Vehicle1();
		v.car();
		v.train();
		v.bike();
		

	}

}
