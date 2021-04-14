
public class Person {
	
	private String name;
	private int age;

	public Person() {
		this("Anoy",-1);
	}
//	public Person() {
//		name = "Annonymus";
//		age = -1;
//	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println("Name: " + name + "\tAge:" + age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\tAge:" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person is no more!");
	}
	
	public static void main(String[] args) 
	{
		Person p = null;
		for (int i=1; i<=5; i++)
			p = new Person();
		
		System.gc();//Requesting GC
		
//		Person p1 = new Person("Polo", 21);
//		System.out.println(p1.hashCode());
//		System.out.println(p1.toString());
//		
//		Person p2 = new Person("Polo", 21);
//		System.out.println(p1.equals(p2));
		
//		p1.print();
//		
//		Person p2 = new Person();
//		p2.print();
	}

}
