package day14;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAssignment {

	public static void main(String[] args)throws IOException{
		FileReader f1=new FileReader("C:FileSample1.txt");
		int i;
		while((i=f1.read())!=-1) {
			System.out.println((char)i);
		}
		f1.close();
	}
}
		