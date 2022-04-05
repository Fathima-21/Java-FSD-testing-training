package day7;

import java.util.Scanner;

public class GreatestArrayAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("greatest among array is "+max);
		
		
	}

}
