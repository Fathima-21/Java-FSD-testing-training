package day9;

public class Staticexmp2 {
	static int cube(int x) {    // static method (can be accessed directly without object creation)
		return x*x*x;
	}
	int square(int x) {  // non static method
		return x*x;
	}

	public static void main(String[] args) {
		int result=cube(3);
		Staticexmp2 obj=new Staticexmp2();
		int res=obj.square(5);
		System.out.println(result);
		System.out.println(res);
		
	}

}
