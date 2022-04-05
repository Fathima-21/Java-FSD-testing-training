package day14assignment;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileCreateWriteRead {

	public static void main(String[] args) throws IOException  {
		File f0=new File("C:FileSample.txt");
		if(f0.createNewFile()) {
			System.out.println("a new file named "+f0.getName()+" has been ceated");
		}
		else {
			System.out.println("file already exists");
		}
		FileWriter obj1=new FileWriter("C:FileSample.txt");
		obj1.write("I am writing to this file from progam...." );
		obj1.write("welcome to ooty!nice to meet you");
		obj1.close();
		Scanner sc=new Scanner(f0);
		while(sc.hasNextLine()) {
			String filedata=sc.nextLine();
			System.out.println(filedata);
		}
		sc.close();
	}
}
		
	
		
	