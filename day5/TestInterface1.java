package day5;

// interface can have only abstract methods

interface Shape{
	void display();
}
class Rectangle implements Shape{
	Rectangle(){
		System.out.println("rectangle constructor is called");
		}
	public void display() {
		System.out.println("this is rectangle");
	}
}
class Triangle implements Shape{
	Triangle(){
		System.out.println("triangle constructor is called");
	}
	public void display() {
		System.out.println("this is triangle");
	}
}

public class TestInterface1 {

	public static void main(String[] args) {
		Shape s=null;
		s=new Rectangle();
		s.display();
		s=new Triangle();
		s.display();
		
	}

}
