package day11;
import java.io.IOException;

public class ThrowsExample {
	void m() throws IOException{
		throw new IOException("device error"); // checked exception
	}
	void n() throws IOException{
		m();
		
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		ThrowsExample h=new ThrowsExample();
		h.p();
		System.out.println("normal flow");
		
	}

}
