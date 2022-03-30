package day10;

public class Exceptionexmp3 {

	public static void main(String[] args) {
		int sum=0;
		try {
			int [] arr1= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[15]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		for(int i=0;i<10;i++) {
			sum+=i;
		}
		System.out.println("sum of elements of array is..."+sum);
	}

}
