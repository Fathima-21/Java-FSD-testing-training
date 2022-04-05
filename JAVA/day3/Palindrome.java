package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check for palindrome");
		int num=s.nextInt();
		int original=num;
		// for finding reversal of a original number
		int reverse=0,lastdigit;
		while(original!=0) {
			lastdigit=original%10; // isolate last digit in the original number and store it in variable 'lastdigit'
			reverse=(reverse*10)+lastdigit; // appending last digit to reverse
			original=original/10; // removing last digit from original number
		}
		if(num==reverse) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}

}
