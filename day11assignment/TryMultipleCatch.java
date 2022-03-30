package day11assignment;

public class TryMultipleCatch {

	public static void main(String[] args) {
			int [] arr= {1,5,6,4,7,8,6,4,9};
			try {
				System.out.println(arr[15]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("exception handled");
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("exception handled");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("rest of code");
	}

}
