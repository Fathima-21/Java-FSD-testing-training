package day14;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class SampleRead {

	public static void main(String[] args) throws IOException {
		File File1=new File("C:SampleOutputWriter.txt");
		int len=(int) File1.length();
		try(FileReader fr=new FileReader(File1)){
			char[] x=new char[len];
			fr.read(x,0,7);
			String filecontent=new String(x);
			System.out.println(filecontent);
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
