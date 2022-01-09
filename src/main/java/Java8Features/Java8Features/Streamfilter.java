package Java8Features.Java8Features;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Streamfilter {
	public static void main(String[] args) {
// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(89);
		l.add(9);
		l.add(78);
// for(Integer a: l) {
// System.out.println(a);
// }
		l.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		
		BinaryOperator<Integer> b = (x, y) -> x + y;//nothing is returning here simply we are adding two operand so uses 
		//functional interface that is BinaryOperator
		
		Consumer<Integer> c = x -> System.out.println(x);
		
		Function<Integer, Integer> function = x -> x * x;
		l.stream().map(function);
	}
}
