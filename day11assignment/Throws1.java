package day11assignment;
// exception occurred but not handled
import java.io.IOException;

public class Throws1 {
	void method() throws IOException{
		throw new IOException("device error");
	}

	public static void main(String[] args) throws IOException {
		Throws1 o=new Throws1();
		o.method();
		System.out.println("normal flow....");
		
	}

}
