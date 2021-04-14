import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropsDemo {
	
	public static void main(String[] args) throws IOException {
		
			FileReader reader = new FileReader("src/person.txt");
			
			Properties p = new Properties();
			p.load(reader);
			
		
		
		System.out.println("Name : "+p.getProperty("name"));
		System.out.println("Age : "+p.getProperty("age"));
		System.out.println("City : "+p.getProperty("city"));
	}
}
