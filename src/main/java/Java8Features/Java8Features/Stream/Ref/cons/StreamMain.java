package Java8Features.Java8Features.Stream.Ref.cons;

import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,5,6,8);
        //list.stream().forEach(System.out::println);
        System.out.println(list.stream().count());
        list.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        list.stream().forEach(System.out::println);
        //list.stream().flatMapToInt()

    }
}
