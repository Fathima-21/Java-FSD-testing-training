package day7;

import java.util.Scanner;

public class OccurenceArrayAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer array size");
		int n=sc.nextInt();
		System.out.println("enter integer array values");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array values are");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("enter integer whose occurrence you want to check");
		int integer=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==integer)
				c++;
		}
		System.out.println("occurences of integer in array are "+c);
		
		
	}

}
