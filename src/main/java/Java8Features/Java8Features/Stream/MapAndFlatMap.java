package Java8Features.Java8Features.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {
     //map() method used for transformation
    //flatMap() method used for transformation and flattering
    //both these methods are intermediate methods and return another stream() as part of output
    //map produces one value for each input value
    //flat map operation produces an arbitrary number for each input value;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> ans = numbers.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(ans);
        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);

        List<Integer> list = number.stream().flatMap(l-> l.stream()).collect(Collectors.toList());
       // List<Integer> list = number.stream().map(l-> l.stream()).collect(Collectors.toList());
        List<Stream<Integer>>list1 = number.stream().map(l-> l.stream()).collect(Collectors.toList());

        for(Stream<Integer> stream :list1){
            System.out.println(stream.collect(Collectors.toList()));
        }


       // System.out.println(list);
    }


}
