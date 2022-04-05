package day8;

import java.lang.*;

public class StringsCompare {

	public static void main(String[] args) {
		String s1="Amazon";
		String s2="amazon";
		String s4="Amazon";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=new String("Amazon");
		System.out.println(s1==s3);// returns false bcoz s1 is created by string literal and s3 is created by new keyword
		System.out.println(s1==s4);
	}

}
