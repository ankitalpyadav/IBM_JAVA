import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		FileInputStream inFile = null;

		FileOutputStream outFile = null;

		try {

		inFile = new FileInputStream("D:/Temp/python.exe"); //22 MB approx

		outFile = new FileOutputStream("D:/Temp/p2.exe");

		System.out.println("Copying file...");

		int ch = 0;

		long ms1 = System.currentTimeMillis();

		 while(true) {

		ch = inFile.read();

		if(ch == -1) break;

		outFile.write(ch);

		}

		long ms2 = System.currentTimeMillis();

		 System.out.println("File copied successfully in " + (ms2-ms1) + " ms");

		}

		catch(IOException e) {

		e.printStackTrace();

		}

		 finally {

		try {

		inFile.close();

		outFile.close();

		} catch(Exception e) {

		e.printStackTrace();

		}

		}
	}

}
