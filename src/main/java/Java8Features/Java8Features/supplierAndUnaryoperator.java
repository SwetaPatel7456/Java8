package Java8Features.Java8Features;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class supplierAndUnaryoperator {

	public static void main(String args[]) {

//supplier dont take input but produce output
//no input> return something
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 7, 9);

		Supplier<Integer> supplier = () -> 2;
		Supplier<Integer> supplier2 = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(supplier.get());
		System.out.println(supplier2.get());

//Unary operator
		UnaryOperator<Integer> uoperator = (x) -> 3 * x;
		System.out.println(uoperator.apply(10));

	}
}