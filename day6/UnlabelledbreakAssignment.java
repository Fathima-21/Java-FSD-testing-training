package day6;

import java.util.Scanner;

public class UnlabelledbreakAssignment {

	public static void main(String[] args) {
		System.out.println("enter a number");
		System.out.println("1.addition,2.subtraction,3.product,4.division");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("enter numbers for addition");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
			break;
		case 2:
			System.out.println("enter numbers for subtraction");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a-b);
			break;
		case 3:
			System.out.println("enter numbers for product");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a*b);
			break;
		case 4:
			System.out.println("enter numbers for division");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a/b);
			break;
		
		}
		System.out.println("end of the program");
		
		
	}

}
