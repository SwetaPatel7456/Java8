package Java8Features.Java8Features;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        //boolean valued function.... It is functional interface it has Test method  in this we can store
        // condition
//        Predicate<Integer> predicate =  x->x%2==0;
//        System.out.println(predicate.test(2));
//
//        Predicate<String> predicate1 = s-> s.startsWith("s");
//        Predicate<String> predicate2 = s-> s.endsWith("a");
//        Predicate<String> and = predicate1.and(predicate2);
//        Predicate<String> or = predicate1.or(predicate2);
//
//        System.out.println(and.test("swetap"));
//        System.out.println(or.test("eva"));
//        System.out.println(predicate1.negate().test("pweta"));

        Function<String,String> function = s-> s.toUpperCase();
        Function<String,String> function1 = s-> s.substring(0,3);
        Function<String,String> newFunction = function.andThen(function1);
        System.out.println(newFunction.apply("sweta"));
    }
}
