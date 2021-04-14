import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class PersonCollection {
	public static void main(String[] args) {
		Vector<Person> persons = new Vector<Person>();
		persons.add(new Person("Polo", 21));
		persons.add(new Person("Lili", 22));
		persons.add(new Person("Mili", 23));
		
		for (Person p : persons) 
			System.out.println(p);
		
		//Write code for HashMap

		Hashtable<Integer, Person> people = new Hashtable<Integer, Person>();
		people.put(2, new Person("Polo", 21) );
		people.put(4, new Person("Lili", 22) );
		people.put(1, new Person("Mili", 23) );
		
		for (Integer key: people.keySet()) 
		    System.out.println(key + " : "+ people.get(key));
		
		
	}
}
