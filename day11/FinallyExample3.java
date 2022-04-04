package day11;

// program where where exception occurs but is handles ,yet finally block is executed

public class FinallyExample3 {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println("data= "+data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of code");
		
	}

}
