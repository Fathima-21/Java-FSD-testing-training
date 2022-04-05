package day4;

// hierarchical inheritance
class Mummy{
	void mine(){
		System.out.println("she has gone to work");
	}
}
class Papa extends Mummy{
	void work() {
		System.out.println("he is busy with some work");
	}
}
class Puppy1 extends Mummy{
	void sleep() {
		System.out.println("my puppy is sleeping");
	}
}

public class HierarchyInheritanceAssignment {

	public static void main(String[] args) {
		Papa p=new Papa();
		Puppy1 u=new Puppy1();
		p.work();
		p.mine();
		u.sleep();
		

	}

}
