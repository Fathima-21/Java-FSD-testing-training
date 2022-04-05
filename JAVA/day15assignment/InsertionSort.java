package day15assignment;
// program for implementing insertion sort

public class InsertionSort {
	void insertionsort(int[] arr) {
		int temp,j;
		int n=arr.length;
		for(int i=1;i<n;i++) {
			temp=arr[i];  // element to be compared
			j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
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
		int arr[]= {5,1,6,2,4,3};
		InsertionSort i=new InsertionSort();
		i.insertionsort(arr);
		System.out.println("sorted array.....");
		i.printarray(arr);
		
		
	}

}
