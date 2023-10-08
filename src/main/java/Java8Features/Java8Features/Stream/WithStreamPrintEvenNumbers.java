package Java8Features.Java8Features.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStreamPrintEvenNumbers {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,5);
        //without stream u have to just do calculation just iterate over list one by one
        //using stream we can do it in one line

        Stream<Integer> stream = list1.stream();
        //List<Integer> newList = stream.filter(i-> i%2==0).collect(Collectors.toList());
        stream.filter(i->i%2==0).map(i-> i*i).forEach(System.out::println);
        //stream.mapToDouble();
        //stream api basically used to group the colections object
        //it is also used to
    }
}
