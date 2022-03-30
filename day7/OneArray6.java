package day7;

import java.util.*;

// program to take inputs of a student about their marks in bio,chem,physics and calculate their average scores in science

public class OneArray6 {

	public static void main(String[] args) {
		System.out.println("enter no of students");
		Scanner sc=new Scanner(System.in);
		int students_no=sc.nextInt();
		System.out.println("enter names of students followed by their marks in bio,chem and physics");
		String [] names=new String[students_no];
		int[] bio=new int[students_no];
		int[] chem=new int[students_no];
		int[] phys=new int[students_no];
		double[] avg=new double[students_no];
		for(int i=0;i<students_no;i++) {
			names[i]=sc.next();
			bio[i]=sc.nextInt();
			chem[i]=sc.nextInt();
			phys[i]=sc.nextInt();
		}
		for(int i=0;i<students_no;i++) {
			avg[i]=(double)(bio[i]+chem[i]+phys[i])/3;
		}
		System.out.println("average marks of students are");
		for(int i=0;i<students_no;i++) {
			System.out.println(names[i]+" science marks are "+avg[i]);
		}
		
	}

}
