package day11assignment;

import java.io.IOException;

public class Throw {
	void method() throws IOException{
		throw new IOException("device error");
		
	}

	public static void main(String[] args) {
		Throw r=new Throw();
		try {
			r.method();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("exception handled");
		}
		System.out.println("rest of code");
		
	}

}
