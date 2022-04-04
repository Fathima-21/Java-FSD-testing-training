package day9;

class Animal1{
	void eat() {
		System.out.println("Animal is eating");
	}
}

public class Super2 extends Animal1 {
	void eat() {
		System.out.println("cat is eating");
	}
	void test() {
		super.eat();
	}

	public static void main(String[] args) {
		Super2 c=new Super2();
		c.eat();
		c.test();
	}

}
