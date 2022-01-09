package Java8Features.Java8Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class bipredicate_bifunction_biconsumer_primitivefunctional {

	public static void main(String args[]) {

//BiPredicate
		BiPredicate<Integer, String> bipredicate = (number, str) -> {
			return number < 10 && str.length() < 10;
		};

		System.out.println(bipredicate.test(99, "sweta"));

//BiFunction
		BiFunction<Integer, String, String> bifunction = (number, str) -> {
			return number + " " + str;
		};
		System.out.println(bifunction.apply(55, "Om Namh Shivay"));

//Biconsumer
		BiConsumer<String, String> biconsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biconsumer.accept("sweta", "eva");

	}
}
