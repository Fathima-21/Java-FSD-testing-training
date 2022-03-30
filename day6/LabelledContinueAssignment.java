package day6;

public class LabelledContinueAssignment {

	public static void main(String[] args) {
		int i=2;
		if(i==2) {
			inner:
			for(i=2;i<10;i++) {
				if(i==6)
					continue inner;
				System.out.println(i);
			}
				
		}
		System.out.println("end of the program");
	}

}
