package day6;

public class LabelledBreakAssignment {

	public static void main(String[] args) {
		int i=0;
		whileloop:
		while(i<=6) {
			if(i==4)
				break whileloop;
			System.out.println(i);
			i++;
		}
		System.out.println("end of the program");
	}

}
