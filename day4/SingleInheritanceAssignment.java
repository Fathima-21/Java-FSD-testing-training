package day4;

// single inheritance

class Car{
	void run() {
		System.out.println("my car is running");
	}
}
class Bus extends Car{
	void broken() {
		System.out.println("my bus got punctured");
	}
}

public class SingleInheritanceAssignment {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.broken();
		b.run();

	}

}
