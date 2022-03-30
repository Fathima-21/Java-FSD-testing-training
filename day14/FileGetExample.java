package day14;
import java.io.File;
public class FileGetExample {

	public static void main(String[] args) {
		// creating file object
		File f0=new File("C:FileCreateExample.txt");
		if(f0.exists()) {
			//getting file name
			System.out.println("name of file is..."+f0.getName());
			// getting absolute path of file
			System.out.println("absolute path of file...."+f0.getAbsolutePath());
			// checking whether file is writable or not
			System.out.println("Is file writable...."+f0.canWrite());
			// checking whether file is readable
			System.out.println("Is file readable...."+f0.canRead());
			// getting lengh of file in bytes
			System.out.println("length of file...."+f0.length());
		}
		else {
			System.out.println("file does not exist");
		}
		
	}

}
