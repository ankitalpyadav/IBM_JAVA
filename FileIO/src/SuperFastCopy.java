import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
//import com.sun.corba.se.impl.ior.ByteBuffer;

public class SuperFastCopy {
	
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;

		try {

		inFile = new FileInputStream("D:/Temp/python.exe"); //22 MB approx
		outFile = new FileOutputStream("D:/Temp/p2.exe");
		inChannel = inFile.getChannel();
		outChannel = outFile.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024*16);

		System.out.println("Copying file...");

		//int ch = 0;
		long ms1 = System.currentTimeMillis();

		 while(true) {
		 int count = inChannel.read(buffer);
		 if (count == -1) break;
		 buffer.flip();
		 outChannel.write(buffer);
		 buffer.clear();
		}

		long ms2 = System.currentTimeMillis();

		 System.out.println("File copied successfully in " + (ms2-ms1) + " ms");

		}

		catch(IOException e) {

		e.printStackTrace();

		}

		 finally {

		try {

		inChannel.close();

		outChannel.close();
		inFile.close();
		outFile.close();

		} catch(Exception e) {

		e.printStackTrace();

		}

		}
	}

}
