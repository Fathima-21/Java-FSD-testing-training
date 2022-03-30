package day10;

public class Exceptionexmp8 {

	public static void main(String[] args) {
		try {
			int[] arr1=new int[5];
			arr1[9]=30/0;  // exception occured
			System.out.println(arr1[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
