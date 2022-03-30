package day10;

public class Exceptionexmp2 {

	public static void main(String[] args) {
		int a=3,b=2,c=5,avg;
		try {
			avg=(a+b+c)/0;
			System.out.println(avg);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println((a+b+c)/3);
			
		}
	}

}
