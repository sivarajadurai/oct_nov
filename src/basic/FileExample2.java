package basic;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample2 {
	public static void main(String ar[]) {
		try {
			FileWriter fw = new FileWriter("/homes/siva/Downloads/sts-4.12.1.RELEASE/siva.txt");
			fw.write("This is example for batch student");
			fw.close();
		} catch (IOException e) {
			System.out.println("File not exists");
		}
	}

}
