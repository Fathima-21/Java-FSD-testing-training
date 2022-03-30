package day4;

// by changing no of arguments


public class MethodOverload1 {
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(2,3);
		add(5,4,3);
		
	}

}
