package day5;

import java.util.Scanner;

class Student{
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String str=sc.next();
		s.setName(str);
		Student r=new Student();
		System.out.println("enter a number");
		str=sc.next();
		r.setName(str);
		System.out.println(s.getName());
		System.out.println(r.getName());
		
		
	}

}
