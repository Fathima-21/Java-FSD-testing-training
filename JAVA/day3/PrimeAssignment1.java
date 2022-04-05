package day3;

import java.util.Scanner;

public class PrimeAssignment1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,temp=0;
		System.out.println("enter the number to check for prime number");
		num=s.nextInt();
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println(num+" not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
	}

}
