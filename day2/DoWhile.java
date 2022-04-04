package day2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// to print from 1 to 10
		int i=1;
		do {
			System.out.print(i+" , ");
			i++;
		}while(i<=10);
		System.out.println("to print from 10 to 1");
		i=10;
		do {
			System.out.print(i+" , ");
			i--;
		}while(i>=1);
		
		// to print from 1 to n using scanner class
		i=1;
		System.out.println("enter a number to print from 1 to n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
			System.out.print(i+" , ");
			i++;
		}while(i<=n);
		// to print from n to 1
		System.out.println("enter a number to print from n to 1");
		n=s.nextInt();
		do {
			System.out.print(n+" , ");
			n--;
		}while(n>=1);
		System.out.println("end of the program");
		
	}
}
		
		
	
	
