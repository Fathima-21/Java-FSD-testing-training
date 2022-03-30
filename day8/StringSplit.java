package day8;

import java.lang.*;

public class StringSplit {

	public static void main(String[] args) {
		String sample=new String("hello!,   my name is fathima   ,i am 22 years old");
		String[] sentences=sample.split(",");
		for(int i=0;i<sentences.length;i++) {
			System.out.println(sentences[i].trim());  // it will remove white space and print only required string value
		}
		
	}

}
