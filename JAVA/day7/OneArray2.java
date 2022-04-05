package day7;

import java.util.Scanner;

// entering  elements into array dynamically

public class OneArray2 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		System.out.println("enter 10 integer values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("entered values are:");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" , ");
		}
		
		
	}

}
