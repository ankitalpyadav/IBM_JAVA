
public class ChildDemo<A, Z> extends NewDemo<A> {
	private Z temp;
	
	public ChildDemo(A data, Z temp) {
		super(data);
		this.temp = temp;
	}

	public Z getTemp() {
		return temp;
	}

	public void setTemp(Z temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
			ChildDemo<Integer, String> cd = new ChildDemo<Integer, String>(100, "Ankita");
			System.out.println(cd.getTemp() + cd.getData());
	}

}
