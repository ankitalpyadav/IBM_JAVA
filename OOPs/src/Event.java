
public interface Event {

	void doSomething();
}

class EventImpl implements Event{

	@Override
	public void doSomething() {
		System.out.println("First task");
	}
	
	class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Second task");
			
		}
		
	}
	
	public void oneMoreImpl() {
		class NestedEventImpl implements Event{

			@Override
			public void doSomething() {
				System.out.println("Third task");
				
			}
			
		}
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastImpl() {
		Event e = new Event() { //Anonymous inner class

			@Override
			public void doSomething() {
				System.out.println("Fourth task");
				
			}
			
		};
		e.doSomething();
		
	}
	
	public void pakkaLastImpl() {
		Event e = () ->System.out.println("Fifth task"); //Lambda Expression
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.doSomething();
		
		InnerEventImpl in = ei.new InnerEventImpl(); //for non static
		//EventImpl.InnerEventImpl in = new EventImpl.InnerEventImpl();
		in.doSomething();
		
		ei.oneMoreImpl();
		ei.oneLastImpl();
		ei.pakkaLastImpl();
		
		
	}
}