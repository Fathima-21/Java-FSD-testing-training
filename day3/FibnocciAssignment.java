package day3;

import java.util.Scanner;

public class FibnocciAssignment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range for fibnocci series");
		int n=s.nextInt();
		int n1=0,n2=1,n3,count=1;
		System.out.print(n1+" "+n2);
		while(count<=n) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			count++;
		}
	}

}
