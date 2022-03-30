package day15;
// program to implement selection sort

public class SelectionSort {
	void sort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min_idx]>arr[j]) {
					min_idx=j;
				}
			}
			// swap found minimum element with arr[i]
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
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
		SelectionSort s=new SelectionSort();
		int [] arr= {4,1,9,2,3,6};
		s.sort(arr);
		System.out.println("sorted array...");
		s.printarray(arr);
	}
}
		
	


