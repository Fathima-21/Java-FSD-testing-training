package day2;

import java.util.Scanner;

public class CompoundAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		a+=b;// a=a+b
		System.out.println("addition ..."+a);
		a-=b;  // a=a-b
		System.out.println("subtraction..."+a);
		a*=b;  //a=a*b
		System.out.println("multiplication..."+a);
		a/=b;  // a=a/b
		System.out.println("division..."+a);
		a%=b;  // a=a%b
		System.out.println("remainder is"+a);
		
		// unary operator
		int c=1;
		c++;  //c=c+1
		System.out.println("c="+c);
		c--;   //c=c-1
		System.out.println("c="+c);
		
	}

}
