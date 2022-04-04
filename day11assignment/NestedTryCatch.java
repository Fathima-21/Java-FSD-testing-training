package day11assignment;

public class NestedTryCatch {

	public static void main(String[] args) {
		int data=45;
		try {
			try {
				int d=data/0;
				System.out.println("vlaue of d...."+d);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("exception handled");
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("exception handled");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			int[]  arr= {4,89,4,8,25,10,98};
			System.out.println(arr[25]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("exception handled");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("arithmetic exception handled");
		}
		System.out.println("rest of code");
		
	}

}
