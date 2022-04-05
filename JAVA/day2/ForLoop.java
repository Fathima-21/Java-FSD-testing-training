package day2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// to print from 1 to n
		for(int i=1;i<=10;i++) {
			System.out.print(i+" , ");
		}
		System.out.println("to print from 10 to 1");
		for(int i=10;i>=1;i--) {
			System.out.print(i+" , ");
		}
		// to print from 1 to n using scanner class
		System.out.println("enter n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" , ");
		}
		// to print from n to 1 using scanner class
		System.out.println("enter n");
		n=s.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.print(i+" , ");
		}
	}

}
