import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2Demo {

	public static void main(String[] args) {
		String [] word = {"Apple", "Google", "microsoft", "apache", "Facebook", "IBM", "capgemini", "123", "A234", "567B"};
		List<String> words = Arrays.asList(word);
//		words.forEach(System.out::println);
		
//		words.stream().sorted().forEach(System.out::println);
		
//		words.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
//		words.stream().findFirst().ifPresent(System.out::println);
		
//		words.stream().filter(str -> str.startsWith("A")).forEach(System.out::println);
		
//		words.stream().filter(str -> str.contains("le")).forEach(System.out::println);
		
//		Stream.of("Anna", "Sean", "James", "Bret").sorted().forEach(System.out::println);
		
//		System.out.println(Arrays.stream(word).map(s -> s.toLowerCase()).count());
		
		System.out.println(Arrays.stream(word).filter(s -> s.contains("A")).count());
	}

}
