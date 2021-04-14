
@FunctionalInterface
public interface Hello {
		String sayHello();
		
		default void sayHola() {
			System.out.println("Hola Monde!");
		}
		
		static void sayBonjour() {
			System.out.println("Bonjour le Monde ");
		}
}

class HelloDemo{
	public static void main(String[] args) {
		Hello h = () -> "Hello World!";
		System.out.println(h.sayHello());
		
		Hello h2 = () ->{
			String msg = "Hello Again";
			return msg;
		};
		System.out.println(h2.sayHello());
		h2.sayHola();
		
		Hello.sayBonjour();
	}
}
