
public class DaemonDemo extends Thread {
	private int limit;

	public DaemonDemo(String name,int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=1; c<= limit; c++)
			System.out.println(name + ": " + c);
	}
	
	public static void main(String[] args) {
		DaemonDemo d1 = new DaemonDemo("First", 50);
		DaemonDemo d2 = new DaemonDemo("Second", 100);
		DaemonDemo d3 = new DaemonDemo("Third", 75);
		
		DaemonDemo d4 = new DaemonDemo("Daemon", 5000000);
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}









