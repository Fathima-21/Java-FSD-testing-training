package day17;

public class LinearSearch {
	public static int linearsearch(int arr[],int n,int search) {
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				return i+1;
			}
			}
		return -1;
		}
	public static void main(String[] args) {
		int[] arr= {55,29,10,40,57,41,20,24,45};
		int search=10;  // value to be searched
		int n=arr.length;
		int result=linearsearch(arr,n,search);   // store result
		if(result==-1) {
			System.out.println("element is not found in the array");
		}
		else {
			System.out.println("element is found at "+result+" position of the array");
		}
	}
		
	

}
