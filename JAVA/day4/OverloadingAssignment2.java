package day4;

public class OverloadingAssignment2 {
	static void main(int a,double b) {
		System.out.println(a+b);
	}
	static void main(int a,int b) {
		System.out.println(a*b);
	}
	static void main(double a,double b) {
		System.out.println(a/b);
		
	}

	public static void main(String[] args) {
		main(50.25,10.25);
		main(10,5.0);
		main(5,10);

	}

}
