package day2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double c;
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		c=a+b;
		System.out.println("addition is...."+c);
		c=a-b;
		System.out.println("subtraction is..."+c);
		c=a/b;
		System.out.println("division is..."+c);
		c=a*b;
		System.out.println("multiplication is..."+c);
		c=a%b;
		System.out.println("remainder is"+c);
;		
	}

}
