package Java8Features.Java8Features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter_different_courses{

	public static void main(String[] args) {
// List<String> list = List.of("Spring","Spring Boot","Docker","Kubernetes");
//
// list.stream().forEach(System.out::println);
// System.out.println("*****");
//
// list.stream().filter(string -> string.contains("Spring")).forEach(System.out::println);
//
// System.out.println("*****");
//
// list.stream().filter(string -> string.length()>=4).forEach(System.out::println);
//
// list.stream().map(courses -> courses.length()).forEach(System.out::println);
//

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 7, 9);
		printSquareOfNumbers(numbers);
		int sum = addListFunction(numbers);
		System.out.println(sum);
		List<Integer> result = usecollectorsToCollectElement(numbers);

	}

	private static List<Integer> usecollectorsToCollectElement(List<Integer> numbers) {
//Use of collectors
		Predicate<? super Integer> predicate = n -> n % 2 == 0;

		return numbers.stream().filter(predicate).collect(Collectors.toList());

	}

	public static int add(Integer a, Integer b) {
		return a + b;
	}

	public static void printSquareOfNumbers(List<Integer> l) {

		l.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
	}

	public static int addListFunction(List<Integer> l) {
		return l.stream()
//.reduce(0,Filtercourses::add);
//.reduce(0,(x,y)-> x+y);
				.reduce(0, Integer::sum);
	}

}