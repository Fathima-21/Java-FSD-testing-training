package day8;
// write a program to take input of a string and also take in no of characters as the user wishes and check if they are present in the string

import java.util.Scanner;

public class StringCountAssignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String s=sc.next();
		System.out.println("enter no of characters as you wish");
		int character=sc.nextInt();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("total no of characters in your string "+count);
		if(count==character) {
			System.out.println("original count of your string and no of characters as per your wish are same");
		}
		else {
			System.out.println("orinal count of your string and no of characters as per your wish are not same");
		}
	}

	

}
