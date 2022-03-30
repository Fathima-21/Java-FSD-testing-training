package day10;

public class Exceptionexmp6 {

	public static void main(String[] args) {
		try {
			int[] arre=new int[5];
			System.out.println(arre[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array cant be accessed bcoz its size is greater than declared size");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
