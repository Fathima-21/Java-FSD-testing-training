package day11;

class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		super(str);
	}
}

public class ThrowExample2 {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("just an example");
		}
		catch(UserDefinedException e){
			System.out.println("caught the user defined exception");
			System.out.println(e);
			
		}
		System.out.println("rest of code");
		
	}

}
