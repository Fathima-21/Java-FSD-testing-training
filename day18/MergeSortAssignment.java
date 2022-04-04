package day18;

public class MergeSortAssignment {
	int[] array;
	int[] tempmergearr;
	int length;
	public void sort(int inputarr[]) {
		this.array=inputarr;
		this.length=inputarr.length;
		this.tempmergearr=new int[length];
		dividearray(0,length-1);
	}
	public void dividearray(int lowerindex,int higherindex) {
		if(lowerindex<higherindex) {
			int middle=(lowerindex+higherindex)/2;
			// it will sort left side of array
			dividearray(lowerindex,middle);
			//it will sort right side of array
			dividearray(middle+1,higherindex);
			mergearray(lowerindex,middle,higherindex);
		}
		}
	public void mergearray(int lowerindex,int middle,int higherindex) {
		for(int i=lowerindex;i<=higherindex;i++) {
			tempmergearr[i]=array[i];
		}
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		while(i<=middle && j<=higherindex) {
			if(tempmergearr[i]<=tempmergearr[j]) {
				array[k]=tempmergearr[i];
				i++;
			}
			else {
				array[k]=tempmergearr[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k]=tempmergearr[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		int [] inputarr= {48,36,13,52,19,94,21};
		MergeSortAssignment ms=new MergeSortAssignment();
		ms.sort(inputarr);
		for(int i:inputarr) {
			System.out.print(i+" ");
		}
		
	}

}
