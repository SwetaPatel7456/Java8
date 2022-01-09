package Java8Features.Java8Features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class comparator_use_over_Courses {
	public static void main(String args[]) {
		List<Courses> courses = List.of(new Courses("Spring", 2000, 9), new Courses("SpringBoot", 1000, 7),
				new Courses("Hibernate", 5000, 8), new Courses("Docker", 6000, 9), new Courses("Jpa", 2000, 5));
		System.out.println(courses);
		Comparator<Courses> comparingByNoOfReview = Comparator.comparingInt(Courses::getReviewScore);
		Comparator<Courses> comparingByNoOfStudentsAndReviews = Comparator.comparingInt(Courses::getNoOfStudent)
				.thenComparing(Courses::getReviewScore);
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndReviews).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndReviews).skip(1).limit(2)
				.collect(Collectors.toList()));
		System.out.println(courses.stream().takeWhile(course -> course.getReviewScore() >= 7)// tb tk include kro jb tk
																								// y condition shi ho
				.collect(Collectors.toList()));
		System.out.println(
				courses.stream().dropWhile(course -> course.getReviewScore() > 8).collect(Collectors.toList()));// dropwhile
		//mtlb isse phle aur isko hta do bad k include kro
																												
		System.out.println(courses.stream().max(comparingByNoOfStudentsAndReviews));// max return the last element in
																					// the list
		System.out.println(courses.stream().min(comparingByNoOfStudentsAndReviews));// max return the last element in
																					// the list
		System.out.println(courses.stream().filter(course -> course.getReviewScore() > 10)
				.min(comparingByNoOfStudentsAndReviews).orElse(new Courses("Docker", 6000, 9)));// when list is empty
																								// then it is used to
																								// print default value
		System.out.println(courses.stream().filter(course -> course.getReviewScore() > 7).findFirst());
		System.out.println(courses.stream().filter(course -> course.getReviewScore() > 7).findAny());
//Total no of students who entrolled for the courses whose rating is more than 7
		System.out.println(
				courses.stream().filter(course -> course.getReviewScore() > 7).mapToInt(Courses::getNoOfStudent).sum());
		System.out.println(courses.stream().filter(course -> course.getReviewScore() > 7)
				.mapToInt(Courses::getNoOfStudent).average());
		System.out.println(courses.stream().filter(course -> course.getReviewScore() > 7)
				.mapToInt(Courses::getNoOfStudent).count());
//Grouping courses in to map using groupingBy
		System.out.println(courses.stream().collect(Collectors.groupingBy(Courses::getNoOfStudent)));
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Courses::getNoOfStudent, Collectors.counting())));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Courses::getNoOfStudent,
				Collectors.maxBy(Comparator.comparing(Courses::getReviewScore)))));
	}
}
