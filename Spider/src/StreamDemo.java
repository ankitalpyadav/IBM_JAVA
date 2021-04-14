import java.io.InputStream;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	private static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Integer [] ar = {2,5,7,9,2};
		List<Integer> numbers = Arrays.asList(ar);
//		numbers.forEach(System.out::println);
//		System.out.println(numbers);
		//numbers.forEach(StreamDemo::print);
		
		//numbers.stream().distinct().forEach(System.out::println);
		
		Stream<Integer> str1 = numbers.stream().distinct();
//		str1.forEach(System.out::println);
//		System.out.println(str1.count());
		
		Stream<Integer> str2 = numbers.stream().filter(n -> n >= 5);
//		str2.forEach(System.out::println);
		
//		numbers.stream().limit(3).forEach(System.out::println);
		
//		numbers.stream().distinct().sorted().forEach(System.out::println);
		
		Integer sum = numbers.stream().reduce(0, (a,b) -> (a+b));
//		System.out.println(sum);
		
//		System.out.println(numbers.stream().reduce(0, Integer::sum));
		
//		System.out.println(IntStream.range(1, 99).count());
		
//		IntStream.range(1, 10).skip(5).forEach(System.out::println);
//		System.out.println(IntStream.range(1, 10).sum());
		
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
		System.out.println(summary);
		
	}

}
