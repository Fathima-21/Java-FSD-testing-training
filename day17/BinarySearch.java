package day17;
// for a binary search to occur in array,array must be sorted
public class BinarySearch {
	public static int binarysearch(int[] arr,int first,int last,int key) {
		if(last>=first) {
			int mid=(first+last)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]>key) {
				return binarysearch(arr,first,mid-1,key); // search in left subarray
			}
			else {
				return binarysearch(arr,mid+1,last,key);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {4,6,8,10,12,14,16};
		int key=8;     // value to be searched
		int last=arr.length-1;  // last index of the array
		int result=binarysearch(arr,0,last,key);
		if(result==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println("element is found at the index :"+result);
		}
	}
		
		
	

}
