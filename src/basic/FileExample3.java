package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExample3 {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("/home/siva/Downloads/sts-4.12.1.RELEASE/license.txt");
			int i=0;
			while((i =fr.read())!=-1) {
			char c = (char)i ;
			System.out.print(c);
			
			}
			fr.close();  
		
		} catch (Exception e) {
		
			System.out.println("something wrong"+e);
		}
	}

}
