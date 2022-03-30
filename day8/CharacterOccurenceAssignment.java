package day8;
// write a program to check for occurence of a particular character in a string and display how many times
// it has occured

import java.util.Scanner;
import java.lang.*;

public class CharacterOccurenceAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		System.out.println("enter the character you want to check");
		char search=sc.next().charAt(0);
		int count=0;
		for(char ch:s1.toCharArray()) {
			if(ch==search) {
				count++;
			}
		}
		System.out.println("no of occurences of character..."+count);
		
		
	}

}
