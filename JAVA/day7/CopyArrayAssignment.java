package day7;

import java.util.Scanner;

public class CopyArrayAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		System.out.println("enter string array elements");
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		System.out.println("string elements are ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		String[] reversearray=new String[n];
		for(int i=0;i<n;i++) {
			reversearray[i]=arr[n-i-1];    // copying and reversing values in arr[i]
		}
		System.out.println("reverse array elements are");
		for(int i=0;i<n;i++) {
			System.out.println(reversearray[i]);
		}
	}

}
