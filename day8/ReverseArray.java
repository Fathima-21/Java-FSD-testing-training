package day8;

// write a java program to take input of a string and convert it into character array and reverse the array,again make that
// reversed character array as string display it

import java.util.Scanner;
import java.lang.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		// creating character  array
		char [] ch;
		// toCharArray() is used to convert string to character array
		ch=s1.toCharArray();
		// PRINTING ARRAY
		for(char c:ch) {
			System.out.println(c);
		}
		String reverse="";
		for(int i=ch.length-1;i>=0;i--) {
			reverse+=ch[i];
		}
		System.out.println("reverse of the string   "+reverse);
		
	}
}
		
