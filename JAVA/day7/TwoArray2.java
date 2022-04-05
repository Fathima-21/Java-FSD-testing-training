package day7;

import java.util.*;

// to perform addition of 2 dimensional arrays and take row and column size from user

public class TwoArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column size of the array");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][] arr1=new int[row][column];
		int [][] arr2=new int[row][column];
		int [][] arr3=new int[row][column];
		System.out.println("enter values into array 1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("");
		System.out.println("enter values in second array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("sum of arrays are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println(arr3[i][j]+" ");
			}
			System.out.println("");
		}
		}

}
