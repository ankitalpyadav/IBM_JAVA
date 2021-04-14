import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {
		PersonAgeComparator pac = new PersonAgeComparator();
		
		Comparator<Person> pnc = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> persons = new TreeSet<Person>();
		persons.add(new Person("Polo", 30));
		persons.add(new Person("Lili", 45));
		persons.add(new Person("Mili", 21));
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}

class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
	
	
}