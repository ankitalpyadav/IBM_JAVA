
public class StaticDemo {
	
	private int data;
	private static int count;
	
	
	public StaticDemo(int data) {
		this.data = data;
		count++;
	}
	public void print() {
		System.out.println("Data: "+data+"\tCount: "+count);
		
	}

	public static void main(String[] args) {
		StaticDemo d1 = new StaticDemo(100);
		d1.print();
		StaticDemo d2 = new StaticDemo(200);
		d2.print();
		StaticDemo d3 = new StaticDemo(300);
		
		d1.print();
		d2.print();
		d3.print();
		

	}

}
