package day2;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		System.out.println("start of the program");
		int i=1;
		while(i<=10) {    // to print from 1 to 10
			System.out.print(i+" , ");
			i++;
		}
		System.out.println();
		i=10;   // to print from 10 to 1
		while(i>=1) {
			System.out.print(i+" , ");
			i--;
		}
		// to print from 1 to n using scanner class
		System.out.println("enter a number to print from 1 to n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		i=1;
		while(i<=n) {
			System.out.print(i+" , ");
			i++;
		}
		// to print from n to 1
		System.out.println("entera number to print from n to 1");
		n=s.nextInt();
		while(n>=1) {
			System.out.println(n+" , ");
			n--;
		}
		System.out.println("end of the program");
		
	}

}
