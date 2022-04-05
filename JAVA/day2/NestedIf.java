package day2;

import java.util.Scanner;

// to check if a person can donate blood.condition 1:age>18, condition 2:weight>50

public class NestedIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age,weight;
		System.out.println("enter your age");
		age=s.nextInt();
		if(age>=18) {
			System.out.println("enter your weight");
			weight=s.nextInt();
			if(weight>50) 
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("weight must be greater than 50");
			}
		}
		else {
			System.out.println("you are not eligible to donate blood");
			
		}
		
		
	}

}
