package day6;

public class BreakExample1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;    //  breaking the loop
			}
			System.out.println(i);
		}
		System.out.println("end of the program");
	}

}
