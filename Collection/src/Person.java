
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Pesron [Name : " + name + ", Age : " + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}

	
	
	
}
