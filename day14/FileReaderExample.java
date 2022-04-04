package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReaderExample {

	public static void main(String[] args) {
		try {
			File f1=new File("C:FileCreateExample.txt");
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine()) {
				String fileData=sc.nextLine();
				System.out.println(fileData);
			}
				sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("there is some unexpected problem");
			System.out.println(e);
		}
		
	}

}
