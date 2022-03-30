package day3;

import java.util.Scanner;

public class GreatestAssignment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,max,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest of three numbers.."+max);
	}

}
