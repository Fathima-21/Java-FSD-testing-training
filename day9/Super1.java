package day9;

class Animal{
	String color="white";
}

public class Super1 extends Animal {
	String color="brown";
	void printcolor() {
		System.out.println(color); // brown
		System.out.println(super.color);  // white
	}

	public static void main(String[] args) {
		
		Super1 s=new Super1();
		s.printcolor();
		
	}

}
