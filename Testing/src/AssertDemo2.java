
public class AssertDemo2 {
	public static void main(String[] args) {
		assert args.length == 3 : "Mandatory to passs 3 arguments";
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
