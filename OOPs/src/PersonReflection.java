import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class PersonReflection{

	public static void main(String[] args)  throws Exception{
		Person p = new Person("Polo", 21);
		
		Class pc = p.getClass();
		
		//Class pc = Class.forName("Person"); //It loads a java class manually into memory
		System.out.println(pc.getName());
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("------ List of Constructors ------");
		for (Constructor c: constructors)
			System.out.println(c);
		
		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("------ List of methods -------");
		for (Method m: decMethods)
			System.out.println(m);
		
		Field[] f = pc.getDeclaredFields();
		System.out.println("------- List of feilds ------");
		for (Field field : f) {
			System.out.println(field);
			
		}
	}

}
