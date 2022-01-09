package Java8Features.Java8Features;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class creatingstream {
   public static void main(String args[]) {
	   List<Integer> numbers = List.of(1,2,3,4,5,6,7);
	   System.out.println(numbers.stream().reduce(0,Integer::sum));
	   System.out.println(Stream.of(1,2,3,4,5,6,7).reduce(0,Integer::sum));//use refernce pipeline
	   //above both ways is less efficient bz while addition it have to perform unboxing from autoboxing...
	   //so there is another way which is more efficient
	   int [] num = {1,2,3,4,5,6,7};
	   System.out.println(Arrays.stream(num).sum());//it use intpipeline
	   System.out.println(Arrays.stream(num).average());
	   //in above way of doing task there is no problem at all more efficient
	   
	   
	   //suppose u want to iterate loop over first 100 elemnt by putting some condition how u will do
	   
	   System.out.println(IntStream.range(1,10).sum());
	   
	   System.out.println(IntStream.iterate(1,e -> e+2).limit(10).sum());//primitive stream
	   
	   System.out.println(IntStream.iterate(1,e -> e+2).limit(10).peek(System.out::println).sum());
	   
	   System.out.println(IntStream.iterate(2,e -> e*2).limit(10).peek(System.out::println).sum());
	   
	   //suppose i want to convert primitive stream to list how will u do????  we need to do boxed operation
	   System.out.println(IntStream.iterate(2,e -> e*2).limit(10).boxed().collect(Collectors.toList()));
	   
	   System.out.println(LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y));
	   
	   System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply ));
	   
   }
}
