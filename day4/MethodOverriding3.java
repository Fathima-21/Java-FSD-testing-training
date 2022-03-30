package day4; 

class School{
	int students_no=300;
}
class Computers_class extends School{
	int students_no=45;
}

public class MethodOverriding3 {

	public static void main(String[] args) {
		School s=new Computers_class();  // upcasting
		System.out.println(s.students_no);  // data members cannot be overridden
		
	}

}
