package day3;

import java.util.Scanner;

public class PrimeAssignment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,temp=0;
		num=s.nextInt();
		for(int i=1;i<=num;i++) {    // range for printing prime number
			for(int j=2;j<=i-1;j++) {   //  for checking prime number
				if(i%j==0) {// to check if it is divisible,if yes it is not a prime no
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(i);  // for printing prime number
			}
			else {
				temp=0;
			}
		}
	}
}
					
				
			
					
				
			
			
