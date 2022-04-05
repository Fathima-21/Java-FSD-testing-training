package day8;
import java.lang.*;

public class StringCase {

	public static void main(String[] args) {
		String s1="buggati";
		String s2="HONDA";
		System.out.println(s1.toUpperCase());  // just performs the operation and prints the result
		System.out.println(s2.toLowerCase());
		s1=s1.toUpperCase();  // actually changes value of s1
		System.out.println(s1);
	}

}
