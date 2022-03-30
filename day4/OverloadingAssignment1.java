package day4;

// by changing no of arguments


	


public class OverloadingAssignment1 {
	static void add(int a,int b) {
		System.out.println(a*b);
	}
	static void add(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	static void add(int a,int b,int c,int d) {
		System.out.println(a*b*c*d);
	}

	public static void main(String[] args) {
		
		add(5,8);
		add(5,7,1);
		add(1,1,2,5);
		
		

	}

}
