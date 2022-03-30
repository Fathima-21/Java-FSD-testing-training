package day9;

public class Staticexmp1 {
		static int count=0; // a=1,b=2,c=3
		Staticexmp1(){
			count++;
			System.out.println(count);
		}

	public static void main(String[] args) {
		Staticexmp1 a=new Staticexmp1();
		Staticexmp1 b=new Staticexmp1();
		Staticexmp1 c=new Staticexmp1();
		
		
	}

}
