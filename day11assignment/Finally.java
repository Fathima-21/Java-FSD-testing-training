package day11assignment;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		try {
			int d=Integer.parseInt(str);
			System.out.println("converted integer is...."+d);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("exception handled");
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of code");
	}

}
