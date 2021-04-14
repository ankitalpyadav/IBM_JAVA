
public class CmdLineDemo {

	public static void main(String[] args) {
		
		//String [] ar = {"avc","atgf","jkj"};
//		for (String string : args) {
//			System.out.println(string);
//		}

		int sum = 0;
		for (String num : args) {
			sum+=Integer.parseInt(num);
		}
		System.out.println("Sum : " + sum);

	}

}
