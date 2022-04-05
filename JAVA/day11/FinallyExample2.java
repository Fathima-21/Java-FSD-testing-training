package day11;

// program where exception occurs but not handled,yet finally block is executed

public class FinallyExample2 {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println("data= "+data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	/*	catch(Exception e) {  //  default exception handler
			System.out.println("arithmetic exception occured "+e);
		}*/
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of code;");
		
	}

}
