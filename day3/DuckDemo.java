package day3;

import java.util.Scanner;

public class DuckDemo {

	public static void main(String[] args) {
		// duck number is the number which contains zero except at the beginning
		// eg 3048............(0485 is not a duck number bcoz it contains 0 at its beginning
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int t=n,c=0; // copy the number to variable 't'
		while(t>0) {
			int r=t%10;    // we will get last digit as remainder
			if(r==0){    // to check whether last didit is equal to 0.if it is equal,c is incremented by 1;
				c++;
				break;
			}
			t=t/10;     // to remove last digit
			
		}
		if(c==1) {
			System.out.println("it is a duck number");
		}
		else {
			System.out.println("it is not a duck number");
		}
	}

}
