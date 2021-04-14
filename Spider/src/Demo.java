public class Demo {
		private Object data;

		
		public Demo(Object data) {
			super();
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
		
		public static void main(String[] args) {
			//String [] ar = {"Ankita", "anbv"};
			Demo d = new Demo(1);
			d.setData("Ankita");
			System.out.println(d.getData());
		}
		
}
