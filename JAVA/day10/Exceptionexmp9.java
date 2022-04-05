package day10;

import java.util.Scanner;

public class Exceptionexmp9 {

	public static void main(String[] args) {
		try {   // outer try
			try {
				System.out.println("we are going to divide by 0");
				System.out.println("enter a number to divide");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=50/a;
				System.out.println("B= "+b);
			}
			catch(ArithmeticException e) {
				System.out.println("arithmetic exception");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of bounds");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			int [] arr=new int[5];
			arr[9]=65;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
