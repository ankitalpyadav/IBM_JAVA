@FunctionalInterface
interface Maths{
	int max(int a, int b);
}

public class MathDemo {

	public static void main(String[] args) {
		Maths m1 = (x, y) -> {
			if (x>y)
				return x;
			else
				return y;
		};
		System.out.println(m1.max(10, 20));
		
		Maths m2 = (m, n) -> m>n ? m:n;
		System.out.println(m2.max(100, 50));
	}
}
