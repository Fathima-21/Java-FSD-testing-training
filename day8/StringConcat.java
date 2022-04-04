package day8;
import java.lang.*;

public class StringConcat {

	public static void main(String[] args) {
		String s="Indian Institute"+" Of Technology";
		System.out.println(s);
		String s2="Elon";
		String s3="Musk";
		String s4=s2.concat(s3);
		System.out.println(s4);
		
		StringBuilder s5=new StringBuilder("Hello");
		StringBuilder s6=new StringBuilder("World");
		StringBuilder s7=s5.append(s6);
		System.out.println(s7.toString());  // toString() is used to convert stringbuilder object to string object.Here stringbuilder 
		// object is s7.it is converted to string object using toString()
		String s8=String.format("%s%s",s2,s3);
		System.out.println(s8);
		String s9=String.join("",s,s3);
		System.out.println(s9);
	}

}
