package day4;

// runtime polymorphism......(method overriding)
class Softdrink{
	void drink() {
		System.out.println("i like softdrinks");
	}
}
class Pepsi extends Softdrink{
	void drink() {
		System.out.println("i like to drink pepsi");
	}
}
class Cocacola extends Softdrink{
	void drink() {
		System.out.println("i like to drink cocacola");
	}
}
public class RuntimeAssignment {

	public static void main(String[] args) {
		Softdrink d=null;
		d=new Softdrink();
		d.drink();
		d=new Pepsi();
		d.drink();
		d=new Cocacola();
		d.drink();

		
		
	}

}
