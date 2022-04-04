package day7;

import java.util.Scanner;

public class TwoArray4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column size");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char[][] arr=new char[a][b];
		System.out.println("enter array elements");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		System.out.println("displaying values in array ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
