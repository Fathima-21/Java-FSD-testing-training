package day4;
// overriding that is same method in different classes
class Bike{
	void run() {
		System.out.println("bike is running");
	}
	
}
class Honda extends Bike{
	void run() {
		System.out.println("honda is running");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		Bike b=new Honda();     // upcasting
		b.run();
		
	}

}
