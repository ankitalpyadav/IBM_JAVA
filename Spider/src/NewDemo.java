
public class NewDemo<A> {
		private A data;

		public NewDemo(A data) {
			this.data = data;
		}

		public A getData() {
			return data;
		}

		public void setData(A data) {
			this.data = data;
		}
		
		public static void main(String[] args) {
			NewDemo<String> d1 = new NewDemo<String>("Ankita");
			System.out.println(d1.getData());
			
			NewDemo<Integer> d2 = new NewDemo<Integer>(100);
			System.out.println(d2.getData() + d2.getData());
		}
}
