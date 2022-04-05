package day7;

import java.util.Scanner;

public class OneArray3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("entered values in array are");
		for(int i=0;i<size;i++) {
			System.out.print(arr1[i]+" , ");
			
		}
	}

}
