package day4;

// multilevel inheritance
class Animal1{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal{
	void bark() {
		System.out.println("Dog is barking ");
	}
}
class Puppy extends Dog1{
	void weeping() {
		System.out.println("Puppy is weeping");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.weeping();
		p.bark();
		p.eat();
		
	}

}
