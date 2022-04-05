package day9;

public class Finalexmp1 {
		int a=5;
		void test() {
			a=30;
			System.out.println("a value after changing"+a);
		}

	public static void main(String[] args) {
		Finalexmp1 a=new Finalexmp1();
		System.out.println(a);
		a.test();
		
		
	}

}
