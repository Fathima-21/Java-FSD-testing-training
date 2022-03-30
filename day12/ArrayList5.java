package day12;
import java.util.*;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class ArrayList5 {

	public static void main(String[] args) {
		Student s1=new Student(26,"fathima",22);
		Student s2=new Student(31,"jeenabai",22);
		Student s3=new Student(32,"lekshmi",22);
		
		// creating array list of type student that is name of class student
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
		
		
		
		
	}
	
}
