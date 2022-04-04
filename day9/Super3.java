package day9;

class Animal4{
	Animal4(){
		System.out.println("Animal4 constructor is called");
	}
}

public class Super3 extends Animal4 {
	Super3(){
		super();
		System.out.println("super3 constructor is being called");
	}

	public static void main(String[] args) {
		Super3 s=new Super3();
		
		
	}

}
