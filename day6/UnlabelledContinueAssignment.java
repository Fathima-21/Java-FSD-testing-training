package day6;

public class UnlabelledContinueAssignment {

	public static void main(String[] args) {
		int i=0;
		do {
			i++;
			if(i==5)
				continue;
			System.out.println(i);
			System.out.println("Iam a java user");
			}while(i<=6);
	}

}
