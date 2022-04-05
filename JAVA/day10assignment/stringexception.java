package day10assignment;

public class stringexception {

	public static void main(String[] args) {
		String str="Welcome to Ooty!nice to meet you";
		try {
			System.out.println("length of the string ...."+str.length());
			System.out.println(str.charAt(55));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index is out of bounds");
		}
	
	}
			
		}
		
	