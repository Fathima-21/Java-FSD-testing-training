package day11;
// program where exception does not occur but finally block is executed

public class FinallyExample1 {

	public static void main(String[] args) {
		try {
			int data=25/5;
			System.out.println("data= "+data);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of code");
	}

}
