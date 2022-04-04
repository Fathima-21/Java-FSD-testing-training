package day14;
import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		try {
			File f0=new File("C:FileCreateExample.txt");
			if(f0.createNewFile()) {
				System.out.println("a new file named "+f0.getName()+"has been created");
			}
			else {
				System.out.println("file already exists");
			}
		}
		catch(IOException e) {
			System.out.println("an unexpected error occurred");
			System.out.println(e);
		}
	}

}
