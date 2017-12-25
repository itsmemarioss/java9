package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewMethods {

	public static void main(String[] args) {
		System.out.println("\n>>> dropWhile method");
		IntStream.range(0, 10)
			.dropWhile(i -> i <= 5)
			.forEach(System.out::println);
		
		System.out.println("\n>>> takeWhile method");
		IntStream.range(0, 10)
			.takeWhile(i -> i <= 5)
			.forEach(System.out::println);
	
		System.out.println("\n>>> iterate method");
		Stream.iterate(1, n -> n < 10, n -> n+1)
			.forEach(System.out::println);
		
		Stream
			.iterate(1,	n	->	n	+	1)
			.limit(10)
			.forEach(System.out::println);

	}

}
