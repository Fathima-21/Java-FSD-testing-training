package day8;
// write a program to take an input of a string with muliple words and convert it to string array and check if every element of
// that array is palindrome

import java.util.Scanner;
import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String s=sc.nextLine();
		char[] myArray=s.toCharArray();  // converts string to character array using charArray() method
		int size=myArray.length;
		char[] original=Arrays.copyOf(myArray,myArray.length); // copying character array to another character array
		for(int i=0;i<size/2;i++) {
			char temp=myArray[i];
			myArray[i]=myArray[size-i-1];
			myArray[size-i-1]=temp;
		}
		System.out.println("original array "+Arrays.toString(original));
		System.out.println("reverse array "+Arrays.toString(myArray));
		if(Arrays.equals(myArray, original)) {
			System.out.println("entered string is a palindrome");
		}
		else {
			System.out.println("entered string is not palindrome");
		}
		
	}

}
