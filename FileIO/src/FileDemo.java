import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ibmjavafsdmr03\\Desktop\\IBM_JAVA\\hello.txt");
		
		if(file.exists()) {
			System.out.println(file.getName());
			try {
				System.out.println(file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(file.getAbsolutePath());
			
			if (file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());
				
				Date date = new Date(file.lastModified());
				System.out.println(date);
				
				System.out.println(file.lastModified());
				System.out.println(file.length());
			}
			else {
				System.out.println("Content of the directory");
				String [] contents = file.list();
				for (String f : contents) {
					System.out.println(f);
					
				}
			}
		}
		else {
			System.out.println("File does not exists");
		}
	}
}
