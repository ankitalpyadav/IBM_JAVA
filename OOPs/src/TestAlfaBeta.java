
public class TestAlfaBeta {

	public static void main(String[] args) {
		Alfa a = new Alfa();
		a.demo();
		
		Beta b = new Beta();
		b.test();
		b.demo();
		
		Alfa ab = b;
		ab.demo();

		Beta ba = (Beta) ab;
		ba.test();
	}

}
