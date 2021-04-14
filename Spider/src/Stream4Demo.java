import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Stream4Demo {
	
	private static void process(int i) {

	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int n = 1; n<=1000; n++)
			numbers.add(n);
		
//		System.out.println(numbers.stream().count());
		
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(Stream4Demo::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by sequential stream : " + (endTime - startTime));
		System.out.println("===============");
		
		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(Stream4Demo::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by parallel stream : " + (endTime - startTime));
		
		
		
		
	}

}
