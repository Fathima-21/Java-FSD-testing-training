package day8;

import java.lang.*;

public class StringStartEnd {

	public static void main(String[] args) {
		String s1="Indian Ocean Ships";
		System.out.println(s1.startsWith("in"));
		System.out.println(s1.startsWith("In"));
		System.out.println(s1.endsWith("ps"));
		System.out.println(s1.endsWith("pl"));
	}

}
