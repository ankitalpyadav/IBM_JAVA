import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Person p = new Person("Polo", 21);
		System.out.println(p);
		
		String path = "src/pers.dat";
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;
		
		//serializable code
		try {
			ostream = new ObjectOutputStream(new FileOutputStream(path));
			ostream.writeObject(p);
			ostream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Object serialized....");
		
		//Deserialization code
		try {
			istream = new ObjectInputStream(new FileInputStream(path));
			Object obj = istream.readObject();
			System.out.println(obj);
			istream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
