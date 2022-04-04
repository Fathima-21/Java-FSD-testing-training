package day7;

import java.util.*;

public class EmployeeArrayAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employers");
		int empno=sc.nextInt();
		System.out.println("enter employee name,employee salary,employee year of joining");
		String [] empname=new String[empno];
		int [] empsalary=new int[empno];
		int[] empyear=new int[empno];
		for(int i=0;i<empno;i++) {
			empname[i]=sc.next();
			empsalary[i]=sc.nextInt();
			empyear[i]=sc.nextInt();
			}
		System.out.println("displaying values about employee");
		for(int i=0;i<empno;i++) {
			System.out.println(empname[i]+" salary "+empsalary[i]+" year of joining "+empyear[i]);
		}
	}

}
