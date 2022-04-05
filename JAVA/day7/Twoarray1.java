package day7;

import java.util.*;

public class Twoarray1 {

	public static void main(String[] args) {
		int[][] arr1=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values into array1");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		// displaying values in 2 dimensional array
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[i] [j]+" ");
			}
			System.out.println("");
			}
		int[][] arr2=new int[2][2];
		System.out.println("enter values in array 2");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr2[i] [j]+" ");
			}
			System.out.println("");
		}
		int [][] arr3=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("sum of arrays are");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr3[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
