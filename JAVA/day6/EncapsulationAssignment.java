package day6;

import java.util.Scanner;

class Employee{
	private int empid;
	public void setEmployeeid(int empid) {
		this.empid=empid;
	}
	public int getEmployeeid() {
		return empid;
	}
}

public class EncapsulationAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int e=sc.nextInt();
		Employee p=new Employee();
		p.setEmployeeid(e);
		System.out.println(p.getEmployeeid());

	}

}
