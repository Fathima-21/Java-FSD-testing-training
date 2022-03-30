package day3;

import java.util.Scanner;

public class SmallestAssignment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,result;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		result=(a<b)?(a<c?a:c):((b<c)?b:c);
		System.out.println("smallest of three numbers....."+result);
	}

}
