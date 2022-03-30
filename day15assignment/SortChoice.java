package day15assignment;
import java.lang.reflect.Array;
// program to sort an integer array based on users choice either selection sort or bubble sort
import java.util.Scanner;
public class SortChoice {
	void bubblesort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;i++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	void selectionsort(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_indx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min_indx]>arr[j]) {
					min_indx=j;
					
				}
					
				}
			int temp=arr[min_indx];
			arr[min_indx]=arr[i];
			arr[i]=temp;
			}
		}
	void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SortChoice s=new SortChoice();
		System.out.println("enter the size of integer array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter your choice");
		System.out.println("1.bubblesort,2.selectionsort");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("you have selected bubblesort");
			s.bubblesort(arr);
			System.out.println("sorted array...");
			s.printarray(arr);
			break;
		case 2:
			System.out.println("you have selected selection sort");
			s.selectionsort(arr);
			System.out.println("sorted array.....");
			s.printarray(arr);
			break;
		}
		System.out.println("end of program");
			
		
		

	}

}
