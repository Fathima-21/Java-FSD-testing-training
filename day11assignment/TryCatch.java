package day11assignment;

public class TryCatch {

	public static void main(String[] args) {
		String str="hi! its me Fathima";
		System.out.println(str.length());
		try {
			System.out.println("substring from index 20 : "+str.substring(20));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("exception handled");
		}
		System.out.println("rest of code");
		
	}

}
