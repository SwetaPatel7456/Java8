import Java8Features.Java8Features.Person;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class main1 {

    public static void main(String[] args) {

        //two linked list l1 ,l2
        //primeThread
        //oddThread
        List<Integer> list1 = List.of(1,2,3,4,5);
        OptionalDouble avg = list1.stream().mapToDouble(n->n).average();
        System.out.println(avg.getAsDouble());
        double average = list1.stream().mapToDouble(n->n).average().orElse(0.0);
        System.out.println(average);
        list1.stream().sorted((a,b)->b-a).collect(Collectors.toList()).forEach(System.out::println);

//        PrimeThread primeThread = new PrimeThread();
//        Thread t1 = new Thread(primeThread);
//        t1.setName("primeThread");
//        t1.start();
//
//
//        OddThread oddThread = new OddThread();
//        Thread t2 = new Thread(oddThread);
//        t2.setName("odd Thread");
//        t2.start();
//
//        System.out.println( t1.getName());
//        System.out.println(t2.getName());


    }
}
