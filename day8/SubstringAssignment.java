package day8;
// write a java program to take 2 strings as input from user and check if second one is substring of 1st

import java.util.Scanner;
import java.lang.*;

public class SubstringAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a=sc.next();
		System.out.println("enter second string");
		String b=sc.next();
		// contains() used to check if one string contains another string in java or not.it returns boolean value
		Boolean c=a.contains(b);
		if(c==true){
			System.out.println("b is substring of a");
			
		}
		else {
			System.out.println("b not a substring of a");
		}
			
		
		
	}

}
