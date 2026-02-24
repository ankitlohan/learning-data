package Java_W3school;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {
		
		File newFile = new File("Filename2.txt");
	
			//newFile.createNewFile();
			System.out.println(newFile.getName());	
			System.out.println(newFile.getAbsolutePath());
			System.out.println(newFile.canRead());
			System.out.println(newFile.canWrite());
			System.out.println(newFile.length());
			System.out.println("done");
			
			FileWriter writeText = new FileWriter(newFile);
			writeText.write("Files in Java might be tricky, but it is fun enough");
			writeText.close();
			
			Scanner myReader = new Scanner(newFile);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
			
		
	}

}
