package day14;
import java.io.File;
public class FileDelete {

	public static void main(String[] args) {
		File f1=new File("C:FileCreateExample.txt");
				if(f1.delete()) {
					System.out.println(f1.getName()+" has been deleted successfully");
				}
				else {
					System.out.println("there is some unexpected problem in deleting file");
				}
		
	}

}
