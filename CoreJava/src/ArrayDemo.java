
public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[][] jag = {{1,2}, {3,4,5}, {6,7,8,9}};
		
		System.out.println("Two dimensional Jagged Array:");
	       for (int i=0; i<jag.length; i++)
	       {
	          for (int j=0; j<jag[i].length; j++)
	              System.out.print(jag[i][j] + " 	");
	          System.out.println();
	        }
		

	}

}
