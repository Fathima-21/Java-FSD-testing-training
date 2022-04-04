package day6;

interface Bird{
	void peacock();
	void pigeon();
}
class Bird2 implements Bird{
	Bird2(){
		System.out.println("this is about bird");
	}
	public void peacock() {
		System.out.println("hi!i am peacock");
	}
	public void pigeon() {
		System.out.println("hi!i am pigeon");
	}
	
}

public class InterfaceAssignment {

	public static void main(String[] args) {
		Bird b=new Bird2();
		b.pigeon();
		b.peacock();

	}

}
