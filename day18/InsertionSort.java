package day18;

// java program for implementing insertion sort 

public class InsertionSort {
	void sort(int [] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
			
	}

	public static void main(String[] args) {
		int arr[]= {12,11,13,5,6};
		InsertionSort i=new InsertionSort();
		i.sort(arr);
		System.out.println("sorted array......");
		printarray(arr);
		
	}

}
