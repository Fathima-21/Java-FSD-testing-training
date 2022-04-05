package day6;

public class BreakExample2 {

	public static void main(String[] args) {
		// outer loop
		for(int i=1;i<=3;i++) {
			// inner loop
			for(int j=1;j<=3;j++) {
				if(i==2&&j==2) {
					break;    //   using break statement inside for loop
				}
				System.out.println(i+" , "+j);
			}
		}
	}

}
