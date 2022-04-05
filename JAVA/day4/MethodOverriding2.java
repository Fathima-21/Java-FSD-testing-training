package day4;

class Shape{
	void draw() {
		System.out.println("any shape can be drawn");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("circle can be drawn");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("triangle can be drawn");
		
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("rectangle can be drawn");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		Shape s=null;
		s=new Shape();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Triangle();
		s.draw();
		s=new Rectangle();
		s.draw();
		
	}

}
