package Java8Features.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageOfAListOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> x%2==0).mapToInt(n->n).sum();
        numbers.stream().filter(x->x%2==0).mapToDouble(n->n).sum();

//        Double result = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//        System.out.println(result);
        //square of even numbers

//        numbers.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
//        //Merge two list with differenrt elements
//        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> mergedList = Stream.concat(numbers1.stream(),numbers.stream()).distinct().collect(Collectors.toList());
//        //Given a list of words, write a Java 8 program to group them by their length and count the number of words in each group.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grape", "kiwi", "mango");
        Map<Integer,List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(String::length));
        groupedWords.forEach((length, wordList) -> System.out.println("Length " + length + ": " + wordList));




    }
}
