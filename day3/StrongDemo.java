package day3;

import java.util.Scanner;

public class StrongDemo {

	public static void main(String[] args) {
		// strong number eg:145=1!+4!+5!=145
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check for strong number");
		int num=s.nextInt();  // original number
		int temp=num; // copied to another variable temp 
		int sum=0;
		while(temp>0) {
			int fact=1;
			int rem=temp%10;   // to get the last digit
			for(int i=1;i<=rem;i++) {    // for finding factorial of last digit
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println("number is a strong number");
		}
		else {
			System.out.println("number is not a strong number");
		}
	}

}
