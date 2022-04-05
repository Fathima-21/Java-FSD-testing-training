package day4;

// single inheritance

class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		
	}

}
