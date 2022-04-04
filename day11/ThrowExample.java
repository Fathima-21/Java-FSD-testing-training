package day11;

import java.util.Scanner;

public class ThrowExample {
	public static void validate(int a) {
		if(a<18) {
			throw new ArithmeticException("person is not elegible to vote");
		}
		else
			System.out.println("person is eligible to vote");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		validate(age);
		
	
	 
	}

}
