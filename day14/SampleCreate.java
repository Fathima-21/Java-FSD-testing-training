package day14;
import java.io.FileWriter;
import java.io.IOException;


public class SampleCreate {

	public static void main(String[] args)  throws IOException
	{
		String str="This is just some sample content"+" for writing into a file";
		FileWriter f=new FileWriter("C:SampleOutputWriter.txt");
		for(int i=0;i<str.length();i++) {
			f.write(str.charAt(i));
		}
		System.out.println("finished writing");
		f.close();
		
	}

}
