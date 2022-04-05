package day5; 
 
// in encapsulation declare variables as private.then create publec methids(setter method to modify values in variables and 
// getter method to view variable values)

class Employee{
	private int empid;  // declaring variable as private
	
	// creating public methods
	public void setEmpid(int eid) {  // creating setter method to set or modify values in variable
		empid=eid;
	}
	public int getEmpid() {       //    creating getter method to view values in variable
		return empid;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(101);
		System.out.println(e.getEmpid());
		
		
	}

}
