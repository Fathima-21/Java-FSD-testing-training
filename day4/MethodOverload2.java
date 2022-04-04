package day4;
// by changing type of arguments

public class MethodOverload2 {
	static void add(int a,double b) {
		System.out.println(a+b);
	}
	static void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add(11,12.589);
		add(5,4);
		
	}

}
