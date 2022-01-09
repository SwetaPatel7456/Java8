package Java8Features.Java8Features;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BehaviourParametrization {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 7, 9);
		Predicate<Integer> evenpredicate = n -> n % 2 == 0;
		filterAndPrint(numbers, evenpredicate);

		Predicate<Integer> oddpredicate = n -> n % 2 != 0;// boolean value stores in predicate
		filterAndPrint(numbers, oddpredicate);// which take input and return output called function

		Function<Integer, Integer> squaremapper = n -> n * n;
		mapAndCreate(numbers, squaremapper);

	}

	private static void mapAndCreate(List<Integer> numbers, Function<Integer, Integer> squaremapper) {
		numbers.stream().map(squaremapper).forEach(println());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(println());

	} // it is called behaviour parameter bz we are passing predicate as a parameter

private static Consumer<? super Integer> println() {
return System.out::println;//consumer take input but did not return output
}

}