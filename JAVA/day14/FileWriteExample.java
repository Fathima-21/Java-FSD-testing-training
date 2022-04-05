package day14;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		try {
		FileWriter obj1=new FileWriter("C:FileCreateExample.txt");
		// writing contents to the file using write ()
		obj1.write("I am writing to this file from program");
		obj1.close();
		System.out.println("Content has been written to file successfully");
		}
		catch(IOException e) {
			System.out.println("some unexpected error has occurred");
			System.out.println(e);
		}
	}

}
