package day7;

import java.util.Scanner;

public class DuplicateArrayAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		System.out.println("enter integer array values");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("integer array values ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		// searches for duplicate element .outer loop will iterate through arrayfrom 0 to length of array.outer loop will
		// select an element.inner loop willbe uused to copare selected element with rest of elements in array
		//if a match is found which means duplicate element is found then,display the element
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					System.out.println("duplicate array elements are "+arr[j]);
			}
		}
	}

}
