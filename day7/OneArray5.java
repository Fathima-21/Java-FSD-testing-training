package day7;

import java.util.Scanner;

// entering string values into an array

public class OneArray5 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter string array size ");
		int size=sc.nextInt();
		 String[] arr=new String[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" , ");
		}
		
		
	}

}
