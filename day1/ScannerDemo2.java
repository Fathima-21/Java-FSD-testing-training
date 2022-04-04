package day1;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		double a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		d=(a*b*c)/3;
		System.out.println("answer is "+d);
		
		
	}

}
