package day1;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		a=s.nextDouble();
		b=s.nextDouble();
		c=a+b;
		System.out.println("sum="+c);
		
	}

}
