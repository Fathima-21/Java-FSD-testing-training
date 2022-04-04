package day4;

// hierarchical inheritance

class Animal2{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("cat is meowing");
	}


public class TestInheritance3 {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.meow();
		c.eat();
		Dog2 d=new Dog2();
		d.bark();
	}
		
	}

}
