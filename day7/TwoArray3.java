package day7;

import java.util.Scanner;

// to insert values into string 2 dimensional array and print the values

public class TwoArray3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column siz of string array");
		int row=sc.nextInt();
		int column=sc.nextInt();
		String[][] arr=new String[row][column];
		System.out.println("enter string array elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.next();
				
			}
		}
		System.out.println("entered array elements are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
			}
	}

}
