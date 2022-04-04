package day14assignment;
import java.io.File;
public class FileGetInformation {

	public static void main(String[] args) {
		File f1=new File("C:FileSample.txt");
		if(f1.exists()) {
			System.out.println("filename is ....."+f1.getName());
			System.out.println("absolute path of file is...."+f1.getAbsolutePath());
			System.out.println("Is file writable..."+f1.canWrite());
			System.out.println("Is file readable...."+f1.canRead());
			System.out.println("Is file executable...."+f1.canExecute());
			System.out.println("length of file in bytes..."+f1.length());
			
		}

	}

}
