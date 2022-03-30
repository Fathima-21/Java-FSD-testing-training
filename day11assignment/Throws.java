package day11assignment;
// exception does not occur.throws is used to declare exception but it does not handle exception

import java.io.*;

public class Throws {
	void method() throws IOException{
		System.out.println("device operation performed");
	}

	public static void main(String[] args) throws IOException {
		Throws s=new Throws();
		s.method();
		System.out.println("normal flow");
		
	}

}
