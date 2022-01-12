package basic;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
	File f = new File("/home/siva/Downloads/sts-4.12.1.RELEASE/siva.txt");
	boolean isPresent = f.exists();
	boolean isfile = f.isFile();
		
		System.out.println(isPresent);
		System.out.println(isfile);
		
		//f.mkdir();
		///f.delete();
		
		//To list out the fils in the folder
		
//		String files[] = f.list();
//		for(String s : files) {
//			System.out.println(s);
//		}
		
		//To Create new files
		
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//		
//		}
		
		
	
		
	}

}
