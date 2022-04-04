package day6;

public class ContinueExample1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;  // it will skip rest statement and next iteration will happen
		}
		System.out.println(i);
	}

}
}
