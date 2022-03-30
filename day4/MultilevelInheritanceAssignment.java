package day4;

// multilevel inheritance
class Pen{
	void thiss() {
		System.out.println("this is my pen");
	}
}
class Book extends Pen{
	void her() {
		System.out.println("this is her book");
	}
}
class Classroom extends Book{
	void my() {
		System.out.println("this is my classroom");
	}
	
}

public class MultilevelInheritanceAssignment {

	public static void main(String[] args) {
		Classroom c=new Classroom();
		c.my();
		c.her();
		c.thiss();

	}

}
