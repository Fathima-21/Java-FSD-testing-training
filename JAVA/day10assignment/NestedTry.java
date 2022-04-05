package day10assignment;

import java.util.Scanner;

public class NestedTry {
	public static void main(String[] args) {
		try {
			try {
				String ptr=null;
				if(ptr.equals("gfg")) {
					System.out.println("same");
					}
				else {
					System.out.println("not same");
				}
			}
			catch(NullPointerException e) {
				System.out.println("null pointer exception caught");
			}
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			int a=Integer.parseInt(str);    // converts string to integer
			System.out.println("value of a is"+a);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occurred");
		}
	}

}
