package day7;

import java.util.Scanner;

// to add sum of array elements and store it in resultant array

public class OneArray4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] arr3=new int[n];
		System.out.println("enter array 1 elements");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter array 2 elements");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("sum of elements of array are");
		for(int i=0;i<n;i++) {
			System.out.println(arr3[i]+" , ");
		}
		
	}

}
